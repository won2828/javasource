package ch1;

import java.util.*;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 대문자로 시작을 한다면 class or interface 라고 생각하면 됨
        // Scanner 는 어디에 선언된 클래스인가 알려줘야 함
        // System.in(키보드) 로부터 입력받기 위해 필요한 객체
        // System.out(화면)
        Scanner sc = new Scanner(System.in); // 키보드에서 입력 받는 프로그램 만들 때 얘 부터 시작!!!

        System.out.print("두자리 정수를 입력해 주세요 >>");

        // remember!!!
        // 오른쪽 코드부터 해석
        // 25 Enter -> "25"
        String input = sc.nextLine();
        // "25" -> 25 로 변경
        int num = Integer.parseInt(input);// remember!!!

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d\n", num);

        sc.close();
    }
}
