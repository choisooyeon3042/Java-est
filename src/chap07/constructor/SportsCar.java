package chap07.constructor;

/*
* 1. 매개변수가 없는 default 생성자 호출
* 2. 부모 클래스에 매개변수가 있는 생성자 생성 -> 오류 발생함
*    SportsCar sportsCar = new SportsCar(); 더이상 호출할 부모의 default 생성자가 사라짐 super(); Car.java 매개변수가 있는 생성자를 생성해줌
* 3. ? 조치 -> 자식 클래스의 생성자에서 부모클래스의 생성자를 호출하도록 변경 해주면 됨.
* */
public class SportsCar extends Car{

    SportsCar(String name) {
        super(name);
    }

    public static void main(String[] args) {
        // 자식 클래스의 객체를 생성 (생성자)
        SportsCar sportsCar = new SportsCar("sports car"); // super();
    }
}
