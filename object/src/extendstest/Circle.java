package extendstest;

// public class Circle extends Point{ // 상속 관계(is a)

// }

public class Circle extends Shape { // 포함 관계(has a)
    Point center; // 포함 관계
    int r;

    public Circle() {
    }

    public Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    @Override
    void draw() {
        System.out.printf("[center = (%d, %d), r = %d, color = %s]\n", center.x, center.y, r, getColor());
    }

}
