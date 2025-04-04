import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static double roundToNearest(BigDecimal bigDecimal) {
        return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseSign(BigDecimal bigDecimal) {
        return bigDecimal.negate().setScale(2, RoundingMode.HALF_UP);
    }


    public static void main(String[] args) {
        BigDecimal bg = new BigDecimal("4.2545");

        System.out.println(roundToNearest(bg));
        System.out.println(reverseSign(bg));

    }


}
