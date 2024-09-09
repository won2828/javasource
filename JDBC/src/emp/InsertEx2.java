package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import oracle.net.aso.c;

public class InsertEx2 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        // ResultSet rs = null; Select 할 때만 사용

        try {

            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";

            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, password);

            // 입력 데이터 동적 처리
            System.out.println("============== 데이터 입력 ==============");
            System.out.println("사번 : ");
            int empno = Integer.parseInt(sc.nextLine());
            System.out.println("이름 : ");
            String ename = sc.nextLine();
            System.out.println("직무 : ");
            String job = sc.nextLine();
            System.out.println("매니저번호 : ");
            int mgr = Integer.parseInt(sc.nextLine());
            System.out.println("입사일 : ");
            String hiredate = sc.nextLine();
            System.out.println("급여 : ");
            int sal = Integer.parseInt(sc.nextLine());
            System.out.println("수당 : ");
            int comm = Integer.parseInt(sc.nextLine());
            System.out.println("부서번호 : ");
            int deptno = Integer.parseInt(sc.nextLine());

            // 4. insert 작업
            // 4-1. 실행할 sql 구문 작성
            // String sql = "INSERT INTO emp_temp(empno, ename, job, mgr, hiredate, sal,
            // comm, deptno) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            String sql = "INSERT INTO emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno)";
            sql += " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

            // 4-2. sql 구문 전송
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setInt(1, empno);
            pstmt.setString(2, ename);
            pstmt.setString(3, job);
            pstmt.setInt(4, mgr);
            pstmt.setString(5, hiredate);
            pstmt.setInt(6, sal);
            pstmt.setInt(7, comm);
            // java.sql.SQLException: 인덱스에서 누락된 IN 또는 OUT 매개변수:: 8
            pstmt.setInt(8, deptno);

            // 4-3. sql 구문 실생 후 결과 받기
            // executeUpdate() : insert, delete, update
            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("입력 성공");
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
