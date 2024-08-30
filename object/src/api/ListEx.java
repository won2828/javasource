package api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {

        // <객체> : 리스트에 담을 타입
        // 1,2,3,4 => <Integer>, <Double>
        // 10 개의 String 을 담는 크기 설정
        List<String> list = new ArrayList<>(30);

        // add() : 순서대로 추가
        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("사과");
        list.add("복숭아");
        list.add("포도");
        // add(index, 요소) : index 에 추가
        list.add(2, "바나나");

        // 확인
        System.out.println(list); // [사과, 배, 수박, 사과, 복숭아, 포도]

        System.out.println("list 의 크기 : " + list.size());

        System.out.println("특정 위치 요소 가져오기 : " + list.get(3));
        System.out.println("특정 위치 요소 제거 : " + list.remove(3));
        System.out.println(list);
        System.out.println("특정 위치 요소 제거 : " + list.remove("복숭아"));
        System.out.println(list);

        System.out.println("특정 요소 포함 여부 : " + list.contains("포도")); // true
        System.out.println("특정 요소 포함 여부 : " + list.contains("딸기")); // false
        System.out.println("특정 요소 저장 위치 : " + list.indexOf("포도")); // 4
        System.out.println("특정 요소 저장 위치 : " + list.indexOf("딸기")); // -1

        Object[] arr = list.toArray();
        for (Object object : arr) {
            System.out.println(object);
        }

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

    }
}
