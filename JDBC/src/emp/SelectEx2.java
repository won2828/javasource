package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx2 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // select 구문 시에만 사용

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";

            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, password);

            // 4. connection 을 통해서 실행하고자 하는 sql 구문 전송
            String sql = "SELECT * FROM emp";
            pstmt = con.prepareStatement(sql);

            // 5. 전송된 sql 구문 실행
            rs = pstmt.executeQuery();

            System.out.println("========");
            System.out.println("EMPNO");
            System.out.println("ENAME");
            System.out.println("JOB");
            System.out.println("MGR");
            System.out.println("HIREDATE");
            System.out.println("SAL");
            System.out.println("COMM");
            System.out.println("DEPTNO");
            System.out.println("========");

            // 6. 결과값이 담긴 rs 에서 하나씩 조회
            while (rs.next()) {
                // numer => getInt() / varchar2 => getString() / date => getDate()
                // () 안에는 컬럼 번호 or 컬럼명 가능
                System.out.print("EMPNO : " + rs.getInt(1) + "\n");
                System.out.print("EMANE : " + rs.getString(2) + "\n");
                System.out.print("JOB : " + rs.getString(3) + "\n");
                System.out.print("MGR : " + rs.getInt(4) + "\n");
                System.out.print("HIREDATE : " + rs.getDate(5) + "\n");
                System.out.print("SAL : " + rs.getInt(6) + "\n");
                System.out.print("COMM : " + rs.getInt(7) + "\n");
                System.out.printf("DEPTNO : " + rs.getInt(8) + "\n");
                System.out.println();
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
