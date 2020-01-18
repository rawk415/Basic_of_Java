package chapter04;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("합계를 구할 수를 입력하세요.(종료:0)");

        while(flag) {
            System.out.print(">>");
            String tmp = scanner.next();
            num = Integer.parseInt(tmp);

            if(num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println("합계: " + sum);
    }
}
