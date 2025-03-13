package chap09;

public class BalanceExceptionSample2 {
    public static void main(String[] args) {

        // 1. try-catch 예외 처리
        // 2. throws 예외 던지기
        try {
            throwMethod();
        } catch (BalanceInsufficientException e) {
            System.out.println("잔액이 부족하다고합니다. error" + 1000);
        }
    }

    public static void throwMethod() throws BalanceInsufficientException{
        throw new BalanceInsufficientException("잔금부족, 잔금: " + 1000);
    }
}
