package classtest;

public class Tv {
    // 속성 => 변수
    private int channel; // 채널 : 번호
    private boolean power; // 전원 상태 : on(true) / off(false)
    private String company; // 제조사 : Samsung, LG, ...

    // 생성자
    // 클래스 이름(){}
    // 생성자 오버로딩 (하나의 클래스에 생성자가 여러개 존재)
    Tv() {
        // default 생성자
    }

    Tv(int channel, boolean power, String company) {
        this.channel = channel;
        this.power = power;
        this.company = company;
    }

    // 전원을 켠다 / 끈다
    void power() {
        power = !power;
    }

    // 채널을 올린다 / 내린다
    void channelUp() {
        this.channel++;
    }

    void channelDown() {
        this.channel--;
    }

    // set 으로 시작하는 메소드는 setter 메소드

    // get 으로 시작하는 메소드는 getter 메소드
    public int getChannel() {
        // channel 값 보낼게
        return channel;
    }

    public String getCompany() {
        return company;
    }

    public boolean isPower() {
        return power;
    }
}
