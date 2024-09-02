package exception;

public class ExceptionEx6 {
    public static void main(String[] args) {
        try {
            startInstall();
        } catch (SpaceException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후 다시 설치하시기 바랍니다.");
        } catch (MemoryException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("다시 설치하시기 바랍니다.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enounghSpace())
            throw new SpaceException("설치할 공간이 부족합니다.");
        if (!enounghMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    static void copyFile() {

    }

    static void deleteTempFiles() {

    }

    static boolean enounghMemory() {
        return true;
    }

    static boolean enounghSpace() {
        return false;
    }
}
