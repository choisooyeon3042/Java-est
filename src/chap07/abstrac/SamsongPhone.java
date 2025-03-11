package chap07.abstrac;

public class SamsongPhone extends Phone{

    // 추상 메소드는 구현을 강제화 한다.
    @Override
    public void turnOff() {
        System.out.println("Samsong phone off");
    }

    public static void main(String[] args) {
        // 추상 클래스로 객체 생성 불가!
        // Phone phone = new Phone();

        // 상위 클래스의 타입이 하위 클래스를 참조할 수 있는 능력 = 다형성 /chap06/Polymorphism
        // 추상 클래스의 "다형성" 실습해보기
        // Phone phone2 = new SamSongPhone();
        // Phone phone3 = new LGPhone();
        // Phone phone4 = new SmartPhone();


        // 상속 받은 클래스 객체 생성 가능
        // 단 부모클래스의 추상 메소드를 재정의 해줘야 한다. @Override
        SamsongPhone samsong = new SamsongPhone();
        samsong.turnOn();
        samsong.turnOff();
    }
}
