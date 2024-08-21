package ch2;

public class OperEx3 {
    public static void main(String[] args) {
        /*
         * 534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때 학생 한 명당 몇 개를
         * 나눠 가질 수 있고 최종적으로 몇 개가 남는지 출력하기
         * 
         * 조건) 변수 사용
         */

        int pencil = 534;
        int student = 30;

        System.out.printf("연필의 개수는 %d개 입니다.\n", pencil);
        System.out.printf("학생수는 %d명 입니다.\n\n", student);

        System.out.printf("학생 한 명당 %d개 의 연필을 나눠 가실 수 있습니다.\n", (pencil / student));
        System.out.printf("최종적으로 %d개 의 연필이 남습니다.\n\n", (pencil % student));

        /*
         * 사다리꼴의 넓이를 구한 후 출력하기
         * 윗변 : 5, 아랫변 : 10, 높이 : 7
         * 조건) 변수 사용, 소수자리 수 까지 출력
         */

        int top = 5, bot = 10, hei = 7;
        double result = (double) (top + bot) / 2 * hei;

        System.out.printf("사다리꼴의 넓이 : %.1f\n\n", result);

        /*
         * 변수 num의 값보다 크면서 가장 가까운 10의 배수에서 변수 num 의 값을 뺀 나머지를 구한 후 출력
         * ex) 24라면 24보다 크면서 가장 가까운 10의 배수는 30 -24 = 6 이 출력되도록 한다.
         */

        int num = 73;
        int remain = num % 10;
        int close = num - remain + 10;

        System.out.printf("%d - %d = %d\n\n", close, num, (close - num));

    }
}
