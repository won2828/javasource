package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        /*
         * 배열(array) : 같은 타입의 여러 변수를 하나의 묶음으로 다루기
         * 배열 선언 : int[] score;
         * 배열 생성 : score = new int[10];
         * 
         * ex) 10 명의 수학 점수를 관리
         * int score1 = 88, score2 = 78, score3 = 66...
         */

        int[] score = new int[10];

        score[0] = 88;
        score[1] = 78;
        score[2] = 66;

        System.out.println("학생 1번의 수학 점수 : " + score[0]);
        System.out.println("학생 2번의 수학 점수 : " + score[1]);
        System.out.println("학생 3번의 수학 점수 : " + score[2]);
    }
}
