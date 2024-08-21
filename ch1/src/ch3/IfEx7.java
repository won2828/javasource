package ch3;

import java.util.Scanner;

public class IfEx7 {
    public static void main(String[] args) {
        // 세 개의 숫자를 입력 받은 후
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하시오 >>> ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자를 입력하시오 >>> ");
        int b = sc.nextInt();
        System.out.print("세번째 숫자를 입력하시오 >>> ");
        int c = sc.nextInt();

        // 입력 받은 세 개 의 숫자 중 가장 작은 수 출력

        /*
         * if (a <= b && a <= c) {
         * System.out.println(a);
         * } else if (b <= a && b <= c) {
         * System.out.println(b);
         * } else if (c <= a && c <= b) {
         * System.out.println(c);
         * 
         * }
         */

        int min = a;

        if (min >= b) {
            min = b;
        }

        if (min >= c) {
            min = c;
        }

        System.out.println("가장 작은 수는 : " + min);

        // 가장 큰 수 출력

        int max = a;

        if (max <= b) {
            max = b;
        }

        if (max <= c) {
            max = c;
        }

        System.out.println("가장 큰 수는 : " + max);

        sc.close();

    }
}
