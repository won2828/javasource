package emp2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmpConsoleUtil {

    public EmpDTO insertEmp(Scanner sc) {
        // 입력 데이터 동적 처리
        System.out.println("========= 데이터 입력 ============");
        System.out.print("사번 : ");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.print("이름 : ");
        String ename = sc.nextLine();
        System.out.print("직무 : ");
        String job = sc.nextLine();
        System.out.print("매니저번호 : ");
        int mgr = Integer.parseInt(sc.nextLine());
        System.out.print("입사일 : ");
        String hiredate = sc.nextLine();
        System.out.print("급여 : ");
        int sal = Integer.parseInt(sc.nextLine());
        System.out.print("수당 : ");
        int comm = Integer.parseInt(sc.nextLine());
        System.out.print("부서번호 : ");
        int deptno = Integer.parseInt(sc.nextLine());

        return new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
    }
}