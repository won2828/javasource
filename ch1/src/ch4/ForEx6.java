package ch4;

public class ForEx6 {
    public static void main(String[] args) {
        // 1 ~ 100 까지 숫자 중에서 3 의 배수만을 더하기(단, 9 의 배수는 제외)
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 9 != 0) {
                sum += i;
            }
        }
        System.out.println("결과 1 : " + sum);

        // 1 ~ 100 까지 숫자 중에서 3 의 배수이거나 5 의 배수 합계 구하기
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.printf("결과 2 : " + sum);
    }
}
