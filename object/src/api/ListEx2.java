package api;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        list.add(new Member("hong123", "홍길동"));
        list.add(new Member("hong124", "홍길서"));
        list.add(new Member("hong125", "홍길남"));
        list.add(new Member("hong126", "홍길북"));

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.remove(2));

        System.out.println(list);

        for (Member member : list) {
            String id = member.getId();
            String name = member.getName();
        }
    }
}
