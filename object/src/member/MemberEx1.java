package member;

import java.util.ArrayList;
import java.util.List;

public class MemberEx1 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        // list 에 Member 추가
        list.add(new Member("hong123", "홍길동", "서울", "hong@abc.com"));
        list.add(new Member("hong124", "홍길동", "서울", "hong@abc.com"));
        list.add(new Member("hong125", "홍길동", "서울", "hong@abc.com"));
        list.add(new Member("hong126", "홍길동", "서울", "hong@abc.com"));

        for (Member member : list) {
            System.out.println(member.getId());
            System.out.println(member.getName());
            System.out.println(member.getAddr());
            System.out.println(member.getEmail());
            System.out.println();
        }
    }
}
