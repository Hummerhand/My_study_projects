package Project_3_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /*
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        reversElementArrays2(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        int[] array100 = {10, 20, 4, 77, 51, 100, 544, 8, 132, 78, 36};

        // 1. findMaxElementArrays(new int[]{10, 20, 4});

        // 2.

        for (int i = 0; i < array100.length; i++) {
            System.out.print(array100[i] + " ");
        }

        System.out.println();
        reversElementArrays(array100);

        for (int i = 0; i < array100.length; i++) {
            System.out.print(array100[i] + " ");
        }

        System.out.println();


        // 3.

        int[] array1 = {1, 2, 3 ,4};
        int[] array2 = {5, 6, 7 ,8, 9};

        int[] array3 = arrayCopy(array1, array2);
        for (int iterator: array3) {
            System.out.print(iterator + " ");
        }

        System.out.println();
        */

        // 4.

        //greetings();

        // 5.

        //reverseWords("Hello World");
        //reverseWords1("Hello World");
        //reverseWords2("Hello World");

        int[] array2 = {5, 6, 7 ,8, 9, 50, 51};
        oddEvenElementArrays(array2);

    }

        /* 1. Поиск максимального элемента и его индекса в простом массиве

        public static void findMaxElementArrays(int[] array) {

            int maxElement = array[0];
            int maxIndexLine = 0;

            for (int i = 0; i < array.length; i++) {

                    if (maxElement < array[i]) {
                        maxElement = array[i];
                        maxIndexLine =i;
                    }
            }
            System.out.println(Arrays.toString(array));
            System.out.println("Максимальный элемент: " + maxElement + "\n" +"Индекс максимального элемента: " + maxIndexLine);
        }
        */


    // 2. Зеркальная замена элементов простого массива: int[] array100 = {10, 20, 4, 77, 51, 100, 544, 8, 132, 78, 36};

    public static int[] reversElementArrays(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    // 3. Объеденить два простых Массива

    public static int[] arrayCopy(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        return array3;
    }

    // 4. Запросить ввод имени и пола, и после этого поприветствовать

    public static void greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите ваш пол: ");
        String sex = scanner.nextLine();
        System.out.println("Приветствую Вас " + name + ", ваш пол: " + sex);
    }

    // 5_1. Revers words - 1

    public static void reverseWords(String str) {
        StringBuilder input = new StringBuilder();
        input.append(str);
        input.reverse();
        System.out.println(input);
    }

    // 5_2. Revers words - 2

    public static void reverseWords1(String str) {
        char[] chars = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
        // 5_3. Revers words - 3

        public static void reverseWords2(String str) {
            char[] chars = str.toCharArray();
            String string = "";
            for (int i = chars.length - 1; i >= 0; i--) {
                string += chars[i];
            }
            System.out.println(string);
        }


    // 6. Зеркальная замена первого и последнего элементов простого массива: int[] array100 = {10, 20, 4, 77, 51, 100, 544, 8, 132, 78, 36};

    public static int[] reversElementArrays2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1];
            array[array.length - 1] = temp;
            break;
        }
        return array;
    }

    // 7. Подсчет четных и не четных элементов в массиве

    public static void oddEvenElementArrays(int[] array) {
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                evenCount++;
            } else if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Количество четных элементов в массиве: " + evenCount);
        System.out.println("Количество нечетных элементов в массиве: " + oddCount);
    }
}
