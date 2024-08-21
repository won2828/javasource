package ch2;

import java.util.Scanner;

public class OperEx6 {
    public static void main(String[] args) {

        /*
         * 논리연산자 : &&(and), ||(or), !(not)
         * true && true, true || true : true
         * true && false : false
         * truee || false : true
         * 
         * and : 모든 조건이 true 인 경우에만 true
         * or : 적어도 하나가 true 라면 true
         * 
         * 
         * true && false && true : false 가 속해 있는 경우 다음 조건은 검사하지 않음
         * true || false || true : 처음 조건이 true 라면 다음 조건은 검사하지 않음
         */
        int value = 6;

        /*
         * value 가 2의 배수 혹은 3의 배수인지 확인한 후 맞다면
         * 2 또는 3의 배수 라고 출력하기
         */
        System.out.printf("주어진 값은 %d 입니다.\n", value);
        // System.out.println((value % 2 == 0) || (value % 3 == 0));
        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.printf("%d 은(는) 2 또는 3의 배수입니다.\n", value);
        }

        char ch1 = 'A';
        System.out.println("ch1 = " + ch1);
        System.out.println(ch1 >= 'A');
        System.out.println(ch1 <= 'Z');

        Scanner sc = new Scanner(System.in); // 키보드에서 입력 받는 프로그램 만들 때 얘 부터 시작!!!

        System.out.print("ch2에 해당하는 알파벳을 입력해주세요 >> ");

        char ch2 = sc.next().charAt(0);

        // "ch1 이 대문자라면 ch1 은 대문자입니다." 출력
        System.out.println("ch2 = " + ch2);
        if (ch2 >= 'A' && ch2 <= 'Z') {
            System.out.println("ch2 은 대문자 입니다.");
        } else {
            System.out.println("ch2 은 대문자가 아닙니다.");
        }
        sc.close();
    }
}
