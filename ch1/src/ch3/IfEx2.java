package ch3;

public class IfEx2 {
    public static void main(String[] args) {
        // 임의로 1 ~ 6 사이의 숫자 생성

        // 0.0 <= Math.random() < 1.0
        // System.out.println(Math.random());
        // 0.0 * 6 <= Math.random() < 1.0 * 6
        // System.out.println(Math.random() * 6);

        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("random = " + dice);

        if (dice == 1) {
            System.out.println("주사위가 1 이 나옴.");
        } else if (dice == 2) {
            System.out.println("주사위가 2 가 나옴.");
        } else if (dice == 3) {
            System.out.println("주사위가 3 이 나옴.");
        } else if (dice == 4) {
            System.out.println("주사위가 4 가 나옴.");
        } else if (dice == 5) {
            System.out.println("주사위가 5 가 나옴.");
        } else if (dice == 6) {
            System.out.println("주사위가 6 이 나옴.");
        }

    }
}
