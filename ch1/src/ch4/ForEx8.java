package ch4;

public class ForEx8 {
    public static void main(String[] args) {
        /*
         * 4x + 5y = 60 을 만족하는 x, y 값 출력
         * x, y 는 10 이하의 자연수
         * 
         * 4 * 1 + 5 * (1 ~ 10) = 60 ?
         * 4 * 2 + 5 * (1 ~ 10) = 60 ?
         * 4 * 3 + 5 * (1 ~ 10) = 60 ?
         * .
         * .
         * .
         * 4 * 10 + 5 * (1 ~ 10) = 60 ?
         * 
         * 이중 for 구문으로 만들기
         */

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (4 * i + 5 * j == 60) {
                    System.out.printf("4x + 5y = 60 에 만족하는 x, y 값은 %d, %d\n", i, j);
                }
            }
        }
        System.out.println();
    }
}
