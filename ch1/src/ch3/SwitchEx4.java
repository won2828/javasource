package ch3;

import java.util.Scanner;

public class SwitchEx4 {
    public static void main(String[] args) {
        /*
         * 피연산자 2개와 연산자 1개를 입력받기
         * ex) 3, 5, +
         * 입력받은 숫자와 연산자를 이용해서 연산 후 결과 출력
         * 3 + 5 = 8
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("연산자(+,-,*,/,%) 입력 >>> ");
        String op = sc.nextLine();

        // 두 개의 숫자 입력 받기
        System.out.print("첫번째 숫자를 입력하시오 >>> ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력하시오 >>> ");
        int num2 = sc.nextInt();
        // switch (op) {
        // case "+":
        // System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        // break;
        // case "-":
        // System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        // break;
        // case "*":
        // System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        // break;
        // case "/":
        // System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        // break;
        // case "%":
        // System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        // break;
        // }

        int result = 0;

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
        }

        System.out.printf("%d %s %d = %d\n", num1, op, num2, result);

        sc.close();
    }
}
