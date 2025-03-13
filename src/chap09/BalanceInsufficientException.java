package chap09;

public class BalanceInsufficientException extends Exception{
    public BalanceInsufficientException() {

    }
    public BalanceInsufficientException(String errorMessage) {
        super(errorMessage);
    }
}
