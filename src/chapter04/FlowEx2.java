package chapter04;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.print(">");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.next();
        input = Integer.parseInt(tmp);

        if(input==0) {
            System.out.println("0");
        }
        if(input!=0)
            System.out.println("0x");
            System.out.println(input);
    }
}
