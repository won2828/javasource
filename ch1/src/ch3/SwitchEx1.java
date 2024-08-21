package ch3;

public class SwitchEx1 {
    public static void main(String[] args) {
        // switch : if ~ else if ~ else 대체

        /*
         * switch문 형식
         * switch (char or String or int) {
         * case value:
         * 
         * break;
         * 
         * default:
         * break;
         * }
         */

        int dice = (int) (Math.random() * 6) + 1;

        /*
         * if (dice == 1) {
         * System.out.println("주사위가 1 이 나옴.");
         * } else if (dice == 2) {
         * System.out.println("주사위가 2 가 나옴.");
         * } else if (dice == 3) {
         * System.out.println("주사위가 3 이 나옴.");
         * } else if (dice == 4) {
         * System.out.println("주사위가 4 가 나옴.");
         * } else if (dice == 5) {
         * System.out.println("주사위가 5 가 나옴.");
         * } else {
         * System.out.println("주사위가 6 이 나옴.");
         * } -> 이 if ~ else if ~ else 형식을 switch 형식으로 바꿔본다.
         */
        switch (dice) {
            case 1: // dice == 1
                System.out.println("주사위가 1 이 나옴");
                break;
            case 2: // dice == 2
                System.out.println("주사위가 2 가 나옴");
                break;
            case 3: // dice == 3
                System.out.println("주사위가 3 이 나옴");
                break;
            case 4: // dice == 4
                System.out.println("주사위가 4 가 나옴");
                break;
            case 5: // dice == 5
                System.out.println("주사위가 5 가 나옴");
                break;
            default: // dice == 6
                System.out.println("주사위가 6 이 나옴");
                break;
        }

    }
}
