package chap06;

public class Car {
    private String name;
    private String model;
    private int maxSpeed;

    // 생성자
//    Car() {
//        this.name ="초기화 값";
//    }

    // 매개변수가 있는 생성자
    // default 생성자가 사라짐
    Car(String name) {
        this.name = name;
        this.maxSpeed = 200; // 기본적인 maxSpeed로 초기화 가능
    }

    Car(String name, String model) {
        this.name = name;
        this.model = model;
        this.maxSpeed = 200;
    }

    Car(String name, String model, int maxSpeed) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // 리턴 타입이 없는 메소드
    void engineStart() {
        System.out.println("Engine Start!");
    }

    // 리턴 타입이 있는 메소드
    int returnMaxSpeed(int speed) {
        System.out.println("현재 스피드: " + speed);
        return maxSpeed;
    }

    public static void main(String[] args) {

        // Car 클래스의 객체 생성

        Car hyundai  = new Car("hyundai");
        System.out.println(hyundai.name);

        Car sonata  = new Car("sonata");
        System.out.println(sonata.name);

        Car avante  = new Car("avante");
        System.out.println(avante.name);

        Car ferrari = new Car("ferrari");
        System.out.println(ferrari.name);

        Car car  = new Car("");
        Car sportage = new Car("kia", "sportage");
        Car bmw = new Car("bmw", "520d",300);

        System.out.println("bmw name: " + bmw.name);
        System.out.println("bmw model: " + bmw.model);
        System.out.println("bmw maxSpeed: " + bmw.maxSpeed);

        // 메소드 호출
        bmw.engineStart();
        bmw.returnMaxSpeed(10);

        // 1. void value = bmw.engineStart();
        // 호출만 가능 bmw.engineStart();

        // 2. int value2 = bmw.returnMaxSpeed();
        int value2 = bmw.returnMaxSpeed(10); // 반환된 최대 속도를 변수에 저장
        System.out.println("Max Speed: " + value2); // 300

        bmw.engineStart();
        bmw.returnMaxSpeed(350);
    }
}
