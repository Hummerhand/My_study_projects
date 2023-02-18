package Project_SkyLearn_Homeworks;

import java.util.Arrays;

public class Homeworks {
    public static void main(String[] args) {
        char[] chars = {'S', 'A', 'M', 'A', 'T'};
        System.out.println(getString(chars));

        String s1 = "hello";
        String s2 = "hello";
        System.out.println(isEquals(s1, s2));

        getCharIndex("abc");

        System.out.println("Длина введенной строки составляет: " + getLengthOfString("abc dfdf,df"));

        String s = reverse("abcd");
        System.out.println(s);

    }

    // 1. Напишите программу для создания нового объекта String с содержимым массива символов.

    public static String getString(char[] chars) {
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            str += chars[i];
        }
        return str;
    }

    // 2. Напишите программу, чтобы проверить, содержат ли два объекта String одни и те же данные. Используйте для этого цикл.

    public static Boolean isEquals(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    // 3. Напишите программу, чтобы получить индекс каждого символа строки в алфавите

    public static void getCharIndex(String str) {
        char[] chars = str.toCharArray();
        int indexOfChar = 0;
        for (int i = 0; i < chars.length; i++) {
            indexOfChar += chars[i];
            System.out.println("Индекс символа: " + indexOfChar);
            indexOfChar = 0;
        }
    }

    // 4. Напишите программу, чтобы получить длину заданной строки, пробелы и запятые не учитываются. Используйте цикл.

    public static int getLengthOfString(String str) {
        char[] chars = str.toCharArray();
        int length = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] ==  ' ' || chars[i] == ',') {
                continue;
            } else {
                length++;
            }
        }
        return length;
    }

    // 5. Напишите программу для создания новой строки из заданной строки, заменяющей местами последние два символа заданной строки.

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        char temp;
        for (int i = 0; i < chars.length; i++) {
            temp = chars[chars.length - 1];
            chars[chars.length - 1] = chars[chars.length - 2];
            chars[chars.length - 2] = temp;
        }
        String str1 = new String(chars);
        return str1;
    }

    // 6. Напишите программу, которая считывает строку, и выводит true если в заданной строке встречается слово good.
    //given string: goodbye. Result is true.
    //given string: hello. Result is false.

    // 7. Напишите программу, которая считает количество гласных и согласных букв в заданной строке.
}
