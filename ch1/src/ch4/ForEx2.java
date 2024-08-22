package ch4;

import java.util.Scanner;

public class ForEx2 {
    public static void main(String[] args) {

        // 1 ~ 100 까지의 합
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            sum1 = sum1 + i;
        }

        System.out.println("1 ~ 100 의 합 : " + sum1);

        // 1 ~ 100 까지 홀수의 합
        int sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum2 = sum2 + i;
            }
        }

        System.out.println("1 ~ 100 의 홀수의 합 : " + sum2);

        Scanner sc = new Scanner(System.in);

        System.out.print("a에 해당하는 첫번째 수를 입력하시오 >>> ");
        int a = sc.nextInt();

        System.out.print("b에 해당하는 두번째 수를 입력하시오 >>> ");
        int b = sc.nextInt();

        int sum3 = 0;
        for (int i = a; i <= b; i++) {
            sum3 = sum3 + i;
        }

        System.out.println("a ~ b 의 합 : " + sum3);
    }
}
