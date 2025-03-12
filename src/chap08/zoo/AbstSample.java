package chap08.zoo;

public abstract class AbstSample {
    private double number; // 필드 선언 가능

    // 생성자 o
    AbstSample(double number) {

    }

    // 메소드 o
    void method() {

    }

    // 추상 메소드 하나 이상은 반드시 넣기
    abstract double getNumber();
}
