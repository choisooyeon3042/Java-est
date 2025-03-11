package chap07.constructor;

public class Car {
    String name;
    /* default 생성자 */
    // Car() {
    //
    //}

    Car(String name) {
        this.name = name;
    }

    void powerOn() {
        System.out.println("power on");
    }
}
