package fun.methods.unsafe;

public class FunMethods {
    public FunMethods() {

    }

    public static String sayMastersName() {
        return "Harry";
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return a / b;
    }

    public static double getRemainder(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a % b;
    }

    public static int quadrateForTwo(int a, int b, int c) {
        int x = 2;
        return a * (x*x) + b * x + c;
    }

    public static String motivate() {
        return "Keep going!";
    }

}