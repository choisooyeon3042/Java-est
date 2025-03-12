package chap08.basic;

public class Order {
    public static void main(String[] args) {
       double amount = 100.34;

       Payment creditCard = new CreditCard("1234-4567");
       Payment paypal = new Paypal("samlle@naver.com");
       Payment naverPay = new Paypal("sychoi1101@naver.com");


       creditCard.processPayment(amount);
       paypal.processPayment(amount);
       naverPay.processPayment(amount);

       pay("creditCard", amount);
    }

    // 다형성의 특징을 띄우고 있는 인터페이스
    // 각각의 상황마다 다른 로직 실행
    static void pay(String paymentMethod, double amount) {
        Payment payment;
        if (paymentMethod.equals("creditCard")) {
            payment = new CreditCard("1234-4567");
        } else if (paymentMethod.equals("NaverPay")) {
            payment = new NaverPay("");
        } else {
            payment = new Paypal("samlle@naver.com");
        }

        payment.processPayment(amount); // 다형성
    }
}
