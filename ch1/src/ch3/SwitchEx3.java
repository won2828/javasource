package ch3;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 가위(1), 바위(2), 보(3)

        // 컴퓨터가 내는 부분 : random 1~3 사이의 숫자 생성
        int com = (int) (Math.random() * 3) + 1;

        // 사용자가 내는 부분 : 입력 받기

        Scanner sc = new Scanner(System.in);
        System.out.print("가위, 바위, 보 중 하나를 입력하시오 >>> ");
        int user = sc.nextInt();

        switch (user - com) {
            case 2:
            case -1:
                System.out.println("LOSE");
                break;
            case 1:
            case -2:
                System.out.println("WIN");
                break;
            case 0:
                System.out.println("DRAW");
                break;
        }
        /*
         * 실패!!!
         * String text = sc.nextLine();
         * 
         * if (text == "가위") {
         * int user = 1;
         * } else if (text == "바위") {
         * int user = 2;
         * } else if (text == "보") {
         * int user = 3;
         * } else {
         * System.out.println("잘못입력하였습니다.");
         * }
         * 
         * 
         * System.out.println(user);
         */
    }
}
