package chapter02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input="";
        int num;
        boolean flag = false;
        do {
            if(flag) {
                System.out.println("두 자리 정수가 아닙니다.");
            }
            System.out.print("두 자리 정수를 하나 입력하세요> ");
            input = scanner.nextLine();
            num = Integer.parseInt(input);
            flag = true;
        }while (!((num > 10) && (num < 100)));


        System.out.println("입력내용: " + input);
        System.out.println("num = " + num);
    }
}
