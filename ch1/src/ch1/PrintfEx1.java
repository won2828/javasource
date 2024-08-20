package ch1;

public class PrintfEx1 {
    public static void main(String[] args) {
        // printf()
        // boolean : %b, 정수 : %d, 실수 : %f , 문자열 : %s

        char ch1 = 'A';
        System.out.printf("ch1 = %c\n", ch1);
        // System.out.printf("ch1 = %d\n", ch1); IllegalFormatConversionException -->
        // %d를 써서 오류가 남!!! %c로 변경 필요
        System.out.printf("ch1 = %10c\n", ch1);

        double d1 = 3.1415d;
        System.out.printf("d1 = %f\n", d1);
        // 10자리를 씀
        System.out.printf("d1 = %10f\n", d1);
        // 10자리를 씀,소수점 뒤 2자리 제한
        System.out.printf("d1 = %10.2f\n", d1);
    }

}
