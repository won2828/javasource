package ch1;

public class VarlongEx1 {
    public static void main(String[] args) {
        // L, l : 대소문자 둘 다 가능(생략가능)
        long value = 123456789;

        value = 1000000000000L;// int(기본형태)형의 범위를 넘어서는 값일 때 L(long형)이 필수

        // print() 메소드 안의 + 의 의미는 연결 : ""랑 같이 있을 때
        System.out.println("value = " + value);
        // 산술연산
        System.out.println(value + value);
    }
}
