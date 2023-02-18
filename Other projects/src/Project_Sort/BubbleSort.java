package Project_Sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        /*
        int[] array = new int[10];
        int temp;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Не отсортированный массив " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("отсортированный массив " + Arrays.toString(array));
        */

        //==========================================================================================

        int[] array = new int[10];
        int temp;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Не отсортированный массив " + Arrays.toString(array));

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }


    }
}
