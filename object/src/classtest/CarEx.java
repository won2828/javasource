package classtest;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        // car 멤버변수, 메소드 접근 가능해짐
        System.out.println("제 조 사 : " + car.company); // null
        System.out.println("모    델 : " + car.model); // null
        System.out.println("색    상 : " + car.color); // null
        System.out.println("최대속력 : " + car.maxSpeed); // 0
        System.out.println();

        // 속성 변경 가능
        car.company = "KIA";
        car.model = "EV6";
        car.color = "gray";
        car.maxSpeed = 300;

        System.out.println("제 조 사 : " + car.company); // null
        System.out.println("모    델 : " + car.model); // null
        System.out.println("색    상 : " + car.color); // null
        System.out.println("최대속력 : " + car.maxSpeed); // 0
        System.out.println();

        car.forward(); // 전진한다.
        car.backward(); // 후진한다.

    }
}
