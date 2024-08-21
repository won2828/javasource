package ch2;

import java.util.Scanner;

public class OperEx4 {
    public static void main(String[] args) {
        // 사용자로부터 한달 월급을 입력받은 후 월급을 10년 간 저축한 금액은 얼마인지 출력

        Scanner sc = new Scanner(System.in); // 키보드에서 입력 받는 프로그램 만들 때 얘 부터 시작!!!

        System.out.print("사용자의 월급을 입력해주세요 >> ");

        int month = sc.nextInt();
        int year = month * 12;
        int deposit = year * 10;
        System.out.printf("월급 : %d 원\n연봉 : %d 원\n\n10년간 저축한 금액은 %d 원 입니다", month, year, deposit);
    }
}
