package chap08.polymorphism;

public class Driver {
    void drive(Vehicle vehicle) {
        // instanceof
        if (vehicle instanceof Bus) {
            System.out.println("//Bus");
        } else if (vehicle instanceof Taxi) {
            System.out.println("//Taxi");
        }

        vehicle.run(); // 구현 객체의 run() 메소드가 실행됨
    }
}
