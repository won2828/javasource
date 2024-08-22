package ch4;

public class ForEx5 {
    public static void main(String[] args) {
        /*
         * 구구단 2 ~ 9 단 출력
         * 
         * 2 x 1 = 2
         * 2 x 2 = 4
         * 2 x 3 = 6
         * .
         * .
         * 3 x 1 = 3
         * 3 x 2 = 6
         * .
         * .
         * .
         * 9 x 8 = 72
         * 9 x 9 = 81
         * 
         */

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %2d\n", i, j, i * j);
            }
        }
    }
}
