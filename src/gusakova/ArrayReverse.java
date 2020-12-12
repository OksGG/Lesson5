package gusakova;

public class ArrayReverse {


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};

        int middle = array.length/2;
        for (int y = 0; y < middle; y++) {
            int indexValue = array[y];
            array[y] = array[array.length-y-1];
            array[array.length-1-y] = indexValue;
        }
        for (int y = 0; y < array.length; y++) {
            System.out.println("VALUE " + array[y]);
        }
    }


}
