package chapter04;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {

        System.out.print("출력할 라인을 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();

        for (int l = 1; l<=line; l++) {
            for (int c = 1; c <= l; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int l=1; l<=line; l++) {
            for (int c=line; c>l; c--) {
                System.out.print(" ");
            }
            for (int c=1; c<=l; c++) {
                System.out.print("*");
            }
            for (int c = 1; c <= l; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
