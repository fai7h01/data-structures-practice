public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    static int fib(int n) {
        if (n == 0) return 0; // base condition -> termination
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

}
