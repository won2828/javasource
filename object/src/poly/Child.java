package poly;

public class Child extends Parent {

    String name;

    void play() {
        System.out.println("놀자!!!");
    }

    @Override
    void print() {
        super.print(); // 가려진 부모 메소드 호출
        System.out.println("자식 메소드");
    }
}
