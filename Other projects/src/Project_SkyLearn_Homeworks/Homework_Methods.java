package Project_SkyLearn_Homeworks;

import java.util.Arrays;

public class Homework_Methods {
    public static void main(String[] args) {

        System.out.println("Result is: " + isEven(5));

        System.out.println("Result is: " + findMinimum(11, 20, 3));

        System.out.println("Result is: " + arithmeticMean(10, 20, 30));

        System.out.println("Result is: " + swapIntegers(179));

        System.out.println("Count of vowels is: " + vowelsCount("homework"));

        System.out.println("Longer string is: " + findLongerString("first string", "second string"));

        System.out.println("First vowel in string is: " + findVowelInString("laptop"));

        /*
        int[] arr = {1, 2, 8, 10, 3, 7, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        evenToZero(arr);
        System.out.println("New array: " + Arrays.toString(arr));
        */

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println("Result is: " + Arrays.toString(workToArray(arr2)));

    }

    // 1. Given an integer, create a method that returns true if the number is even, false otherwise.

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 2. Given three integer variables, create a method that returns the smallest of them.

    public static int findMinimum(int n1, int n2, int n3) {
        int res = 0;
        if (n1 < n2 && n1 < n3) {
            return n1;
        }
        if (n2 < n1 && n2 < n3) {
            return n2;
        }
        if (n3 < n1 && n3 < n2) {
            return n3;
        }
        return res;
    }

    // 3. Given three integer variables, create a method that returns the arithmetic mean of these numbers.

    public static int arithmeticMean(int n1, int n2, int n3) {
        int result = (n1 + n2 + n3) / 3;
        return result;
    }

    // 4. Given a three-digit integer, create a method that swaps the first and last digits and returns the new number.

    public static int swapIntegers(int number) { // 258
        int temp;
        int n1 = number / 100; // 258 / 100 = 2
        int n2 = (number / 10) % 10; // 258 / 10 = 25, 25 % 10 = 5
        int n3 = (number % 100) % 10; // 258 % 100 = 58, 58 % 10 = 8
        temp = n1;
        n1 = n3;
        n3 = temp;
        String s = "" + n1 + n2 + n3;
        int result = Integer.parseInt(s);
        return result;
    }

    // 5. Given a string value, create a method that returns the number of vowels in a string.

    public static int vowelsCount(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'y'};
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // 6. Given two string values, create a method that returns the longer string.
    //    If the length of these strings are equal, return the first string.

    public static String findLongerString(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1;
        } else if (str1.length() < str2.length()){
            return str2;
        }
        if (str1.length() == str2.length()) {
            return str1;
        }
        return "тут хрень какая-то";
    }

    // 7. Given a string value, create a method that returns its first vowel.
    //    If the word contains no vowels, return the first letter of the string.

    public static char findVowelInString(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'y'};
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    return vowels[j];
                }
            }
        }
        return chars[0];
    }

    // 8. Given an array of integers, create a method that replaces all even numbers in the array with zeros and returns that array.

    public static int[] evenToZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    // 9. Given an array of integers. Return an array, where the first element is the count of positives numbers,
    //    and the second element is sum of negative numbers. 0 is neither positive nor negative.
    //    If the input is an empty array or is null, return an empty array.

    public static int[] workToArray(int[] array) {
        int[] array2 = new int[2];
        int count = 0;
        int summary = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
            if (array[i] < 0) {
                summary += array[i];
            }
        }
        array2[0] = count;
        array2[1] = summary;
        return array2;
    }
}
