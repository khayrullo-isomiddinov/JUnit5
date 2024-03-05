package famous.sequence;

public class Fibonacci {
    public Fibonacci() {

    }

    public static int fib(int n) {
        int a = 0;
        int b = 1;
        if(n == 0) {return a;}
        for(int i = 2; i <= n; i++) {
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }
}