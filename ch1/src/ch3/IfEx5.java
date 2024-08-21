package ch3;

import java.util.Scanner;

public class IfEx5 {
    public static void main(String[] args) {
        /*
         * 근무 시간에 따른 임금 계산
         * 근무 시간 입력 받기
         * 8 시간까지 시간당 기본임금(10000원) 제공
         * 초과근무시간은 시간당 기본임금 1.5배 제공
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.print("근무 시간을 입력하세요 >>> ");
         * 
         * int hours = sc.nextInt();
         * if (hours <= 8) {
         * System.out.printf("임금은 %d 원 입니다.\n", (10000 * hours));
         * } else if (hours > 8) {
         * System.out.printf("임금은 %d 원 입니다.\n", ((10000 * 8) + (15000 * (hours - 8))));
         * }
         * sc.close();
         */

        int rate = 10000, pay = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("근무 시간을 입력하세요 >>> ");

        int hours = sc.nextInt();
        if (hours > 8) {
            pay = (int) (rate * (hours - 8) * 1.5) + rate * 8;
        } else {
            pay = rate * hours;
        }

        System.out.printf("근무 시간 : %d, 임금 : %d\n", hours, pay);

        sc.close();

    }
}
