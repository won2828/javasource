package ch4;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        /*
         * do while 이 for 와 while 과 다른 점은 { } 을 수행한 후 조건식을 검사
         * 최소 1번은 실행 됨
         * 
         * do {
         * 
         * } while (조건식);
         */

        // 1 ~ 100 사이의 임의의 숫자를 추출한 후 해당 숫자 알아맞추기
        Scanner sc = new Scanner(System.in);
        // 임의의 숫자 추출
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;

        do {
            System.out.print(" 1 ~ 100 의 임의의 숫자를 맞춰보세요 >>> ");
            input = sc.nextInt();

            if (answer > input) {
                System.out.println("더 큰 수를 입력해주세요");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력해주세요");
            }

        } while (answer != input);

        System.out.println("정답입니다!! 프로그램 종료");

        sc.close();
    }
}
