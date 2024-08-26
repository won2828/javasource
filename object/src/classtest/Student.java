package classtest;

public class Student {
    // 속성
    private String stdno;// 학번 s12345678
    private String name;// 이름 홍길동
    private String address;// 주소 서울시 종로구
    private String phone;// 핸드폰 010-1234-1234

    // 생성자
    // 클래스 이름(){}
    // 생성자를 명시하지 않는다면 컴파일러가 default 생성자를
    // 자동으로 생성함
    // 생성자 목적
    // 인스턴스 초기화 메소드

    // 생성자 오버로딩

    // 생성자 자동으로 만들기
    // 마우스 우클릭 -> Source Action -> Generate Constuructors
    public Student(String stdno) {
        this.stdno = stdno;
    }

    public Student(String stdno, String name) {
        // this.stdno = stdno;
        this(stdno);
        this.name = name;
    }

    public Student(String stdno, String name, String address) {
        // this.stdno = stdno;
        // this.name = name;
        this(stdno, name);
        this.address = address;
    }

    public Student(String stdno, String name, String address, String phone) {
        // this.stdno = stdno;
        // this.name = name;
        // this.address = address;
        this(stdno, name, address);
        this.phone = phone;
    }

    public Student() {
    }

    // 메소드
    // 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
    // 재사용성, 중복된 코드 제거, 프로그램 구조 구조화

    // 리턴타입 메소드명(){}
    // 정수형, 실수형, 논리형, 문자형, 배열, void 가능
    public String getName() {
        return name;
    }

    // 생성자 만들기
    // Student() {

    // }

    // Student(String stdno) {
    // this.stdno = stdno;
    // }

    // Student(String stdno, String name) {
    // this.stdno = stdno;
    // this.name = name;
    // }

    // Student(String stdno, String name, String address) {
    // this.stdno = stdno;
    // this.name = name;
    // this.address = address;
    // }

    // Student(String stdno, String name, String address, String phone) {
    // this.stdno = stdno;
    // this.name = name;
    // this.address = address;
    // this.phone = phone;
    // }

}
