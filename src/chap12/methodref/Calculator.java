package chap12.methodref;

public class Calculator {

    // 정적 메소드
    // Calculator.staticMethod 호출 가능
    public static int staticMethod(int left, int right) {
        return left + right;
    }

    // 인스턴스 메소드
    // 객체 선언을 해주고 호출 Calculator calculator = new Calculator();
    public int instanceMethod(int left, int right) {
        return left + right;
    }
}
