package chap07;

public class Dog extends Animal{

    // 생성자
    Dog() {
        super("");
        System.out.println("Dog constructor");
    }

    // 매개변수 생성
    Dog(String name) {
        super("");
        this.name = name;
    }

    void sleep(int hour) {
        System.out.println(name + " Zzzz.... for " + hour + "hours");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("happy"); // 자식 클래스의 생성자 호출-> 부모클래스 생성자 자동 호출이 됨
        // dog.name = "happy";
        dog.sleep();
        dog.sleep(10);
    }

    // Animal animal = new Animal();
    // animal.name = "puppy";
    // animal.sleep(10); // 부모 객체는 자식클래스의 요소 사용 불가
}
