package chap09;

public class ATM {
    public static void main(String[] args) {
        int inputMoney = 300000; // 사용자로부터 받은 출금 요청 (30만원)
        Account account = new Account(100000);

        try {
            account.withdraw(inputMoney);
        } catch (BalanceInsufficientException e) {
            // 사용자에게 "잔액부족" 메세지를 보여주기
            // 아무런 처리를 하지 않음
            System.out.println(e.getMessage());
            System.out.println("잔액이 부족합니다. 현재 잔액을 확인하세요.");
        }
    }
}
