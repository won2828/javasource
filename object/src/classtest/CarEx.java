package classtest;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        // car 멤버변수, 메소드 접근 가능해짐
        printCar(car);
        // System.out.println("제 조 사 : " + car.company);
        // System.out.println("모 델 : " + car.model);
        // System.out.println("색 상 : " + car.color);
        // System.out.println("최대속력 : " + car.maxSpeed);
        // System.out.println();

        // 속성 변경 가능
        car.company = "KIA";
        car.model = "EV6";
        car.color = "gray";
        car.maxSpeed = 300;

        printCar(car);
        // System.out.println("제 조 사 : " + car.company);
        // System.out.println("모 델 : " + car.model);
        // System.out.println("색 상 : " + car.color);
        // System.out.println("최대속력 : " + car.maxSpeed);
        // System.out.println();

        car.forward(); // 전진한다.
        car.backward(); // 후진한다.

        Car cars[] = new Car[2];
        System.out.println(cars[0]);
        // NullPointerException : 객체 ==> new 아직 안한 상황 !!!
        // System.out.println(cars[0].color);

        // String 초기화
        // String str = "" / string str = null
        String str = ""; // 빈 문자열
        // NullPointerException
        // String str = null;
        // System.out.println(str.length());

    }

    static void printCar(Car car) {
        System.out.println("제 조 사 : " + car.company);
        System.out.println("모    델 : " + car.model);
        System.out.println("색    상 : " + car.color);
        System.out.println("최대속력 : " + car.maxSpeed);
        System.out.println();
    }
}
