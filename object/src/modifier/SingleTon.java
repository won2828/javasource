package modifier;

public class SingleTon {

    // 자기 자신 인스턴스 생성
    private static SingleTon singleTon = new SingleTon();

    // private 안하면 new 할 때 마다 새로운 SingleTon 생성
    // 인스턴스를 하나만 생성하겠다는 의도
    private SingleTon() {
    }

    public static SingleTon getInstance() {
        return singleTon;
    }
}
