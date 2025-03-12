package chap08.basic;

public class Paypal implements Payment{
    private String email;

    public Paypal(String mail) {
        this.email = mail;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("process payment $" + amount + ", email" + email);
    }
}
