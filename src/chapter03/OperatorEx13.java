package chapter03;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

        char c2 = 'a'+1; // 'a'+1 은 컴파일 시 계산되므로 Exception x.
        System.out.println(c2);
    }
}
