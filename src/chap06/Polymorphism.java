package chap06;

public class Polymorphism {
    public static void main(String[] args) {
        // class Integer extends Number ... {}
        // class Long extends Number ... {}


        // 상위 클래스의 타입이 하위 클래스를 참조할 수 있는 능력 = 다형성
        Number number1 = Integer.valueOf(10);

        Number number2 = Long.valueOf(4500000L);

        Number number3 = Double.valueOf(45.5);
    }
}
