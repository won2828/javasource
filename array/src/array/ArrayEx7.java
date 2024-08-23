package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 정수 10개 배열 생성
        // 배열 요소 섞기

        // 배열을 0 ~ 9 의 숫자로 초기화
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }

        System.out.println(Arrays.toString(numArr));

        System.out.println("============================");

        // 100 번 loop 돌리기
        for (int i = 0; i < 100; i++) {
            int ztn = (int) (Math.random() * 10);

            int tmp = numArr[0];
            numArr[0] = numArr[ztn];
            numArr[ztn] = tmp;

        }

        System.out.println(Arrays.toString(numArr));
    }
}
