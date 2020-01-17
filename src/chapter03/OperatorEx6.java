package chapter03;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b); // must casting
        System.out.println(c);

        System.out.println(3 / 0); // java.lang.ArithmeticException: / by zero
        System.out.println(3 / 0.0); // Infinity
    }
}
