package ch1;

public class CastingEx1 {
    public static void main(String[] args) {
        // 강제 형변환(casting) : 현재 타입을 다른 타입으로 변환
        // 형변환 방법 : (변경할 타입)변수명

        double d = 85.4;
        // 작은 타입 = 큰 타입 (손실이 일어남!!!)
        int score = (int) d;// (int)<-얘를 써주면 해결!!!
        System.out.printf("score = %d\n", score);

        // 큰타입 = 작은타입(여기서는 자동형변환이 일어남!!!)
        // 자동형변환 : 자동으로 발생함
        // byte --> short --> int --> long --> float --> double
        // char --> int --> long --> float --> double
        byte btyeValue = 10;
        int intValue = btyeValue;
        System.out.printf("int 형 변환 후 %d\n", intValue);

        long longValue = intValue;
        System.out.printf("long 형 변환 후 %d\n", longValue);

        double doubleValue = longValue;
        System.out.printf("double 형 변환 후 %f\n", doubleValue);

        System.out.println("-------------------------------------");

        char ch = 'a';
        intValue = ch;
        System.out.printf("int 형 변환 후 %d\n", intValue);

    }
}
