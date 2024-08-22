package ch4;

import java.util.Scanner;

public class ForEx7 {
    public static void main(String[] args) {
        /*
         * 5!(팩토리얼) 출력
         * 5 * 4 * 3 * 2 * 1
         */

        int fac = 1;
        for (int i = 5; i > 0; i--) {
            fac = fac * i;
        }

        System.out.printf("5! = %d\n", fac);

        // 숫자 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 : ");

        int nfac = sc.nextInt();

        fac = 1;
        // 입력 받은 숫자의 factorial을 구한 후
        for (int i = nfac; i > 0; i--) {
            fac *= i;
        }
        // 출력
        System.out.printf("%d! = %d", nfac, fac);

        sc.close();
    }
}
