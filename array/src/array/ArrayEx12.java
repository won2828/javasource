package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx12 {
    public static void main(String[] args) {
        // 학생 5 명의 점수를 입력 받아 최대값, 평균 출력

        // 5 라는 숫자는 변경될 수 있으므로 동적으로 생성
        // 입력 받은 숫자를 기반으로 동적 배열 생성
        int[] arr;

        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 >>> ");
        int std = sc.nextInt();

        // 배열 생성
        arr = new int[std];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("학생 %2d 번의 점수 입력 >>> ", i + 1);
            int scr = sc.nextInt();
            arr[i] = scr;
        }

        System.out.println(Arrays.toString(arr));

        int max = 0;

        for (int score : arr) {
            if (max < score) {
                max = score;
            }
        }
        System.out.printf("최고점수 : %d \n", max);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("평균점수 : %d \n", sum / arr.length);

        sc.close();
    }
}
