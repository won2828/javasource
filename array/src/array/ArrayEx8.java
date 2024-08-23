package array;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        // 45개의 정수값을 저장하는 배열 생성
        int[] array = new int[45];

        // 1 ~ 45 fh 배열 요소 초기화
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < 6; i++) {
            // 0 ~ 44 무작위 숫자 추출
            int ltt = (int) (Math.random() * 45);

            int temp = array[i];
            array[i] = array[ltt];
            array[ltt] = temp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.printf("array[%d]) = %d\n", i, array[i]);
        }
    }
}
