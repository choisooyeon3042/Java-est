package chap09;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(int money) throws BalanceInsufficientException{
        if (balance < money) {
            throw new BalanceInsufficientException("잔액부족, 잔액: " + balance);
        }
        balance -= money; // 출금 성공
    }
}
