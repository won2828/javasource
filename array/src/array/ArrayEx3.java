package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        /*
         * char 배열 선언, 생성
         * char[] 배열명 = {'a', 'b', 'c', 'd'}
         * char 배열명[]
         */

        char[] chArr = { 'a', 'b', 'c', 'd' };

        System.out.println(Arrays.toString(chArr));

        for (int i = 0; i < chArr.length; i++) {
            System.out.println(chArr[i] + "\t");
        }

        System.out.println();

        // 향상된 for 문
        for (char c : chArr) {
            System.out.println(c + "/" + (int) c);
        }

        System.out.println();

        // float 배열 선언, 생성
        float[] flArr = { 12.5f, 13.6f, 14.5f, 13.7f };

        for (float f : flArr) {
            System.out.println(f + "!!!");
        }

        System.out.println();

        // String 배열 선언, 생성
        String[] strArr = { "물고기", "공룡", "나무", "돌" };
        // ArrayIndexOutOfBoundsException
        // System.out.println(strArr[4] + " 내놔");
        System.out.println(strArr[0] + " 내놔");

        for (String string : strArr) {
            System.out.println(string + "!!!");
        }

        System.out.println();

    }
}
