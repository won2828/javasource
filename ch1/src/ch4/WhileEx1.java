package ch4;

public class WhileEx1 {
    public static void main(String[] args) {
        // for (초기화; 조건문; 증감;) { }

        // for (int i = 0; i < 10; i++) {
        // System.out.println("안녕하세요");
        // }

        int i = 0;
        while (i < 10) {
            System.out.println("안녕하세요");
            i++;
        }

        // 1 ~ 10 나열
        i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 1 ~ 100 합
        int sum = 0;
        i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.printf("1 ~ 100 의 합 : %d\n", sum);
    }
}
