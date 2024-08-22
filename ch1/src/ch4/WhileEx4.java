package ch4;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {

        boolean run = true;
        int balance = 0; // 잔액

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("==========================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("==========================================");

            int menu = sc.nextInt();

            switch (menu) {

                case 1:
                    // 잔액 = 잔액 + 입금액
                    System.out.print("입금할 금액을 입력하세요(원) : ");
                    balance += sc.nextInt(); // balance = balance + sc.nextInt();
                    System.out.printf("잔액 : %d 원\n", balance);
                    break;
                case 2:
                    // 잔액 = 잔액 - 출금액
                    System.out.print("출금할 금액을 입력하세요(원) : ");
                    balance -= sc.nextInt(); // balance = balance - sc.nextInt();
                    System.out.printf("잔액 : %d 원\n", balance);
                    break;
                case 3:
                    // 잔액 출력
                    System.out.printf("잔액 : %d 원\n", balance);
                    break;
                case 4:
                    System.out.println("<<<종료합니다!>>>");
                    run = false;
                    break;
            }
        }
    }
}
