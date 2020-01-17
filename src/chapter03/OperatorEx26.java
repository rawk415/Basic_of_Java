package chapter03;

public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d\n", a, b);
        System.out.printf("a!=0 || ++b!=0 = %b\n", a!=0 || ++b!=0); // 논리연산자의 결과가 이미 정해진 경우 이후의 연산을 하지 않음.
        System.out.printf("a=%d, b=%d\n", a, b);
        System.out.printf("a==0 && ++b!=0 = %b\n", a==0 && ++b!=0);
        System.out.printf("a=%d, b=%d\n", a, b);
    }
}
