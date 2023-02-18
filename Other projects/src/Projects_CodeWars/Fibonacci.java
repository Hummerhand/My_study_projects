package Projects_CodeWars;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibEffective(10));

    }

    // Алгоритм - Наивный, медленный, очевидный

    private static long fibNaive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    // Алгоритм - Эффективный и быстрый

    private static long fibEffective(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}
