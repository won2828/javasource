package ch4;

public class ForEx9 {
    public static void main(String[] args) {
        /*
         * 1 ~ 100 사이의 숫자 중에서 소수 출력
         * 소수 : 1 과 자기 자신만으로 나누어 떨어지는 수
         */

        for (int i = 2; i < 101; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                // i 를 j 로 나눈 나머지가 0 인지 확인한 후 숫자 세기
                if (i % j == 0) {
                    cnt++;
                }
            }
            // 숫자가 2라면 소수 => 출력
            if (cnt == 2) {
                System.out.printf("%d\n", i);
            }
        }
    }
}
