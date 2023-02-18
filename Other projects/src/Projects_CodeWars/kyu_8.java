package Projects_CodeWars;


public class kyu_8 {
    public static void main(String[] args) {

        // 1.
        int[] array = countBy(1, 10);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // 2.
       // System.out.println(isLove(2, 2));

    }

    // 1.
    public static int[] countBy(int x, int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * x;
        }
        return array;
    }

    //2.
    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }


}
