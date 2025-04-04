package intList;

public class IntArrayList implements IntListInterface{
 private int[] array;
 private int size;

    public IntArrayList(int[] array, int size) {
        this.array = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        //isFull?
        if (size==array.length){
            // create new array with double size
            int newSize= (int) (array.length*1.5);
            int[] newArray=new int[newSize];
            //Copy array
            System.arraycopy(array,0,newArray,0,array.length);
            array=newArray;
        }
        // insert number in posicion size++
        array[size++]=number;
    }

    @Override
    public int get(int id) {
        //index<0
        if (id<0){
            throw new IndexOutOfBoundsException("The position of index must " +
                    "never be less than 0");
        }
        //index>array.len
        if (id>array.length){
            throw new IndexOutOfBoundsException("The position of index is out" +
                    " of bounds");
        }

        return array[id];
    }
}
