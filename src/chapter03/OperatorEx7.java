package chapter03;

public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b); // Data Overflow
        System.out.println(c);
    }
}
