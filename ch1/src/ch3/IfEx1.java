package ch3;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        /*
         * 조건문
         * ~~ 가 참이라면 ~~ 를 해주세요
         * 조건1 이 참이라면 문장1 을 수행하고 조건2 가 참이라면 문장 2를 수행하기
         * 
         * 
         * 
         * if (조건식 && 조건식 && 조건식) {
         * 수행할 구문;
         * 수행할 구문;
         * 수행할 구문;
         * }
         */

        int num1 = 50;
        // if(){} : {} 을 생략 가능한 경우는 수행 할 구문이 하나의 행인 경우만 가능
        if (num1 < 100) {
            System.out.println("100 보다 작다.");
        }

        int num2 = 100;
        // 100 보다 크다 or 100 보다 작다 둘 중에 하나만 출력
        if (num2 < 100) {
            System.out.println("100 보다 작다.");
        } else {
            System.out.println("100 보다 크거나 같다.");
        }
        /*
         * 점수가 100 ~ 90 사이일 때 등급은 A
         * 점수가 89 ~ 80 사이일 때 등급은 B
         * 점수가 79 ~ 70 사이일 때 등급은 C
         * 점수가 69 ~ 60 사이일 때 등급은 D
         * 나머지 점수는 F
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력해주세요 >> ");
        int grade = sc.nextInt();

        if (grade >= 90) {
            System.out.println("등급은 A 입니다.");
        } else if (grade >= 80) {
            System.out.println("등급은 B 입니다.");
        } else if (grade >= 70) {
            System.out.println("등급은 C 입니다.");
        } else if (grade >= 60) {
            System.out.println("등급은 D 입니다.");
        } else {
            System.out.println("등급은 F 입니다.");
        }
        sc.close();
        /*
         * 중첩가능!!!
         * 
         * if (조건1) {
         * if (조건2) {
         * 
         * }
         * }
         */

    }
}
