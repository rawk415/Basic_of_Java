package chapter04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int max = 100;
        int min = 1;

        int answer = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1에서 100사이의 정수를 입력하세요.>");
            input = scanner.nextInt();

            if (input > answer) {
                max = input;
                System.out.print("더 작은 수로 다시 시도해보세요. ");
                System.out.println("("+ min + " ~ " + max +")");
            } else if (input < answer) {
                min = input;
                System.out.print("더 큰 수로 다시 시도해보세요. ");
                System.out.println("("+ min + " ~ " + max +")");
            }
        }while (input != answer);
        System.out.println("정답입니다.");
    }
}
