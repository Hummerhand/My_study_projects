package Project_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        int[] numbers = {3, 7, -1, 9, 5};

        System.out.print("Введите искаемую цифру: ");
        int needNumber = scanner.nextInt();
        System.out.println("Содержиться ли в массиве цифра " + needNumber + "?");
        boolean isFounded = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == needNumber) {
                isFounded = true;
                System.out.println("Да, данная цифра содержится в массиве");
            }
        }
        if (!isFounded) {
            System.out.println("Нет, данная цифра отсутствует в массиве");
        }


        // E1. Напишите Java-программу, которая принимает четыре целых числа от пользователя и выводит равно,
        // если все четыре равны, и не равно в противном случае.

        System.out.print("Введите размер массива: ");
        int [] array = new int [scanner.nextInt()];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        boolean isTrue = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isTrue = true;
                } else {
                    isTrue = false;
                    break;
                }

            }
        }
        if (isTrue == true) {
            System.out.println("Элементы одинаковые");
        } else {
            System.out.println("Элементы разные");
        }


        // E2. Напишите Java-программу, которая принимает две двойные переменные и проверяет,
        // находятся ли обе переменные строго между 0 и 1 и false в противном случае.

        System.out.print("Введите первую переменную: ");
        double number1 = scanner.nextDouble();
        System.out.print("Введите вторую переменную: ");
        double number2 = scanner.nextDouble();

        System.out.println(number1 > 0 && number1 < 1 && number2 > 0 && number2 < 1);



        // E3. Напишите Java-программу для печати содержимого двумерного логического массива,
        // где t будет представлять true, а f - false.

        String[][] array = {{"true", "false", "true"},
                          {"false", "true", "false"}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equalsIgnoreCase("true")) {
                    System.out.print("t ");
                }
                if (array[i][j].equalsIgnoreCase("false")) {
                    System.out.print("f ");
                }
            }
            System.out.println();
        }


        // E4. Напишите Java-программу для печати массива после изменения строк и столбцов данного двумерного массива.

        int[][] array = {{10, 20, 30},
                         {40, 50, 60}};
        int[][] array2 = new int[3][2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[j][i] = array[i][j];
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }


        // E5. Напишите Java-программу, которая возвращает наибольшее целое число,
        // но не больше логарифма указанного целого числа с основанием 2.

        //E6. Напишите Java-программу для поиска 3-х самых больших элементов в заданном массиве.
        // Элементы в массиве могут располагаться в любом порядке.

        int[] array = {5, 9, 1, 7, 10, 3};
        System.out.println("Оригинальный массив: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Сортированный массив: " + Arrays.toString(array));
        int length = array.length;
        System.out.println("3 самых болших элементов : \n" + array[length - 1] + " " +
                           array[length - 2] + " " + array[length - 3]);



        //E7. Напишите Java-программу для поиска 3 наименьших элементов в заданном массиве.
        // Элементы в массиве могут располагаться в любом порядке.

        //E8. Напишите Java-программу для поиска наименьшего и наибольшего элемента в заданном массиве.
        // Элементы в массиве могут располагаться в любом порядке

        int[] array = {5, 9, 1, 7, 10, 3};
        int maxElement = array[0];
        int minElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
            }
            if (minElement > array[i]) {
                minElement = array[i];
            }
        }
        System.out.println("Массив в оригинале: " + Arrays.toString(array));
        System.out.println("Максимальынй элемент массива: " + maxElement);
        System.out.println("Минимальный элемент массива: " + minElement);
        */

        //E8.


    }
}
