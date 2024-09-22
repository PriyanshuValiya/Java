public class FibonacciSeries {
    public static int fib(int n, int fib[]) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (fib[n] != 0) {
            return fib[n];
        }

        return fib[n] = fib(n - 1, fib) + fib(n - 2, fib);
    }

    public static int fibTabulation(int n) {
        int fib[] = new int[n + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static void main(String args[]) {
        int n = 5;
        int fib[] = new int[n + 1];

        System.out.println(fib(n, fib));
        System.out.println(fibTabulation(n));
    }
}