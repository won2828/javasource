package array;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
         * 10명의 수학 점수를 관리
         * 배열 선언, 생성(배열 요소의 값이 정해져 있는 경우)
         */
        int score[] = { 88, 78, 66, 13, 43, 71, 86, 67, 37, 21 };

        // 수학 점수 출력
        // System.out.println("학생 1 의 수학 점수는 : " + score[0] + " 점");
        // System.out.println("학생 2 의 수학 점수는 : " + score[1] + " 점");
        // System.out.println("학생 3 의 수학 점수는 : " + score[2] + " 점");
        // System.out.println("학생 4 의 수학 점수는 : " + score[3] + " 점");
        // System.out.println("학생 5 의 수학 점수는 : " + score[4] + " 점");
        // System.out.println("학생 6 의 수학 점수는 : " + score[5] + " 점");
        // System.out.println("학생 7 의 수학 점수는 : " + score[6] + " 점");
        // System.out.println("학생 8 의 수학 점수는 : " + score[7] + " 점");
        // System.out.println("학생 9 의 수학 점수는 : " + score[8] + " 점");
        // System.out.println("학생 10 의 수학 점수는 : " + score[9] + " 점");

        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.printf("학생 %2d 의 수학 점수는 : %d 점\n", (i + 1), score[i]);
            sum = sum + score[i];
        }

        // 10명의 수학 점수 합계와 평균 출력
        System.out.println("10명의 수학 점수 합계 : " + sum);
        System.out.println("10명의 수학 점수 평균 : " + sum / score.length);

    }
}
