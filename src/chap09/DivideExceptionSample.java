package chap09;

public class DivideExceptionSample {
    public static void printByeMessage() {
        System.out.println("그럼 안녕히 Bye Bye");
    }
    
    public static void main(String[] args) {
        int inputValue = Integer.parseInt(args[0]);
        int result = 0;
        try {
            result = 5 / inputValue;
            printByeMessage(); // 출력이 안됨
        } catch (ArithmeticException e) {
            result = -1;
            System.out.println("오류: " + e.getMessage());
        } finally {
            System.out.println("최종 result 값: " + result);
            printByeMessage();
        }
    }
}
