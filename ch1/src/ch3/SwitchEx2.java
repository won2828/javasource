package ch3;

public class SwitchEx2 {
    public static void main(String[] args) {
        char grade = 'a';

        switch (grade) {
            // grade 가 A 이거나 a 일 때 우수회원
            case 'A':
            case 'a':
                System.out.println("우수회원");
                break;
            case 'B':
            case 'b':
                System.out.println("일반회원");
                break;
            default:
                System.out.println("손님");
                break;
        }

        // if~else if~else (범위를 가질 때는 if문이 더 편함)

        if (grade == 'A' || grade == 'a') {
            System.out.println("우수회원");
        } else if (grade == 'B' || grade == 'B') {
            System.out.println("일반회원");
        } else {
            System.out.println("손님");
        }
    }
}
