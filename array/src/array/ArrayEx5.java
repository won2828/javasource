package array;

public class ArrayEx5 {
    public static void main(String[] args) {
        // // 2차원 배열
        // // 선언, 생성
        // int[][] scores = new int[2][3];

        // // 첫번째 행
        // scores[0][0] = 15;
        // scores[0][1] = 25;
        // scores[0][2] = 35;

        // // 두번쨰 행
        // scores[1][0] = 45;
        // scores[1][1] = 55;
        // scores[1][2] = 65;

        int[][] scores = {
                { 14, 24, 34 },
                { 44, 54, 64 }
        };

        // 배열의 길이 : 행
        System.out.println("배열 길이 : " + scores.length);
        // 첫번째 행의 열 길이 : 열
        System.out.println("첫번째 행의 열 길이 : " + scores[0].length);

        // 2차원 배열 요소 출력
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("%d\t", scores[i][j]);
            }
            System.out.println();
        }

        System.out.println("============================");

        // 향상된 for 문으로 2차원 배열 출력
        for (int[] is : scores) {
            for (int num : is) {
                System.out.printf("%d\t", num);
            }
            System.out.println();
        }
    }
}
