package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectEx4 {
    public static void main(String[] args) {
        // SelectEx ==> try-with-resources 형태로 변경
        // finally 자원 닫기 자동으로 처리

        // 2. 연결 문자열 작성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 job 입력 : ");
        String job = sc.nextLine();
        System.out.println("조회할 empno 입력 : ");
        int empno = sc.nextInt();

        // empno 동적 처리
        // String sql = "SELECT * FROM emp WHERE empno = " + empno;
        // String sql = "SELECT * FROM emp WHERE empno = ?";

        String sql = "SELECT * FROM emp WHERE empno =? OR job = ?";

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            try (Connection con = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt = con.prepareStatement(sql);) {

                // ? 처리
                pstmt.setInt(1, empno);
                pstmt.setString(2, job);

                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    System.out.println("EMPNO : " + rs.getInt(1));
                    System.out.println("ENAME : " + rs.getString(2)); // corrected field name
                    System.out.println("JOB : " + rs.getString(3));
                    System.out.println("MGR : " + rs.getInt(4));
                    System.out.println("HIREDATE : " + rs.getDate(5));
                    System.out.println("SAL : " + rs.getInt(6));
                    System.out.println("COMM : " + rs.getInt(7));
                    System.out.println("DEPTNO : " + rs.getInt(8));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}