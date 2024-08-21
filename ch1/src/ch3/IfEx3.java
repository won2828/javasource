package ch3;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 점수를 입력 받아서 90 이상이면 A, 98이상이면 A+, 94 이상이면 A0, 94 미만이면 A-
        // 80 이상이면 B, 98이상이면 B+, 94 이상이면 B0, 94 미만이면 B-

        char grade = ' ', opt = '0';

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 >>> ");

        int point = sc.nextInt();

        if (point >= 90) {
            grade = 'A';
            if (point >= 98) {
                opt = '+';
            } else if (point < 94) {
                opt = '-';
            }
        } else if (point >= 88) {
            grade = 'B';
            if (point >= 88) {
                opt = '+';
            } else if (point < 84) {
                opt = '-';
            }
        }

        System.out.printf("점수 : %d, 학점 : %c%c\n", point, grade, opt);
        sc.close();
    }
}
