package intList;

public class IntVector implements IntListInterface{

    private int[] array;
    private int size;

    public IntVector(int array,int size) {
        this.array = new int[20];
        this.size=0;
    }

    @Override
    public void add(int number) {
        //array isFull?
        if (size== array.length){
            int newSize=(int)array.length*2;
            int[] newArray=new int[newSize];
            // copy array with size of the new array
            System.arraycopy(array,0,newArray,0,array.length);
            array=newArray;
        }
        array[size++]=number;
    }

    @Override
    public int get(int id) {
        if (id<0||id>array.length){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[id];
    }
}
