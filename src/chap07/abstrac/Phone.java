package chap07.abstrac;

public abstract class Phone {
    private String owner;

    // 추상 메소드는 구현을 강제화 한다.
    public abstract void turnOff();

    public void turnOn() {
        System.out.println("폰을 켭니다");
    }
}
