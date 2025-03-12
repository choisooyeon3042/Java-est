package chap08.basic;

public class NaverPay implements Payment{
    private String email;

    public NaverPay(String mail) {
        this.email = mail;
    }

    @Override
    public void processPayment(double amount) {
        // 새로운 기능 추가
        System.out.println("process payment" + amount + ", email" + email);
    }
}
