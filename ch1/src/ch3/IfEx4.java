package ch3;

import java.util.Scanner;

public class IfEx4 {
    public static void main(String[] args) {
        // 숫자를 하나 입력받은 우 짝수, 홀수 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>> ");

        int num = sc.nextInt();
        int math = num % 2;
        if (math == 0) {
            System.out.println("짝수입니다.");
        } else if (math == 1) {
            System.out.println("홀수입니다.");
        }
        sc.close();
    }
}
