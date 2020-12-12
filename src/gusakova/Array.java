package gusakova;

public class Array {

    public static void main(String[] args) {
/*1.Пройти с 1-ой до последней строки
        2.Пройти с 1-го до предпоследнего элемента
        3.В текущую ячейку поместить значение следующей
        4.Последнему элементу присвоить 0*
       int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] dest = new int[source.length];
        System.arraycopy(source, 1, dest, 0, source.length - 1);
        System.out.println(Arrays.toString(dest));
 */
        int[] []source = new int [0][9];

        class ArrayLeft {
            public void toLeft(int[][] arr) {

                int tmp;

                for (int i = 0, outLen = arr.length; i < outLen; i++) {

                    for (int j = 0, inLen = arr[i].length; j < inLen; j++) {

                        if ((j + 1) < inLen) {

                            tmp = arr[i][j];
                            arr[i][j] = arr[i][j + 1];
                            arr[i][j + 1] = tmp;



                        } else
                            arr[i][j] = 0;

                    }
                }


            }
        }


        ArrayLeft arrayLeft = new ArrayLeft();

        int [][] ar = {
                {1}, {2}, {3}, {4}, {5},
                {6}, {7}, {8}, {9}, {10}
        };

        String[][] sourceArray = {{"123", "456", "789"},{"1122", "3344", "5566"},{"111","222","333"}};

        for (int y = 0; y < sourceArray.length; y++) {
            String[] childArr = sourceArray[y];
            for (int i = 0; i < childArr.length-1; i++) {
                childArr[i] = childArr[i+1];
            }
            childArr[childArr.length-1] = "0";
        }

        for (int y = 0; y < sourceArray.length; y++) {
            String[] childArr = sourceArray[y];
            for (int i = 0; i < childArr.length; i++) {
                System.out.println("ARR "  + y + " INDEX " + i + " = " + childArr[i]);
            }
        }



    }
}




