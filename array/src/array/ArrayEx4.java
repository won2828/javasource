package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        // 배열 : 한 번 생성하면 길이 변경 불가

        // 학생 10 명의 수학 점수 배열 생성
        int score[] = { 88, 78, 66, 13, 43, 71, 86, 67, 37, 21 };

        // 5 명의 점수를 추가해야 된다면?
        // 15 명의 점수를 담을 저장공간 생성
        int score2[] = new int[15];
        // 기존 10 명의 점수를 복사
        for (int i = 0; i < score.length; i++) {
            score2[i] = score[i];
        }

        for (int i = 0; i < score2.length; i++) {
            System.out.printf("%2d  ", score2[i]);
        }
        System.out.println();

        // 5 명의 점수를 입력 받은 후 배열 요소 채우기
        Scanner sc = new Scanner(System.in);

        for (int i = 10; i < 15; i++) {

            System.out.printf(" %d 번 학생 점수를 입력하세요 >>> ", (i + 1));
            score2[i] = sc.nextInt();
        }
        System.out.println();
        // 확인
        System.out.println(Arrays.toString(score2));

        sc.close();

    }
}
