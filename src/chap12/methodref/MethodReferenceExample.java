package chap12.methodref;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        operator = (x, y) -> Calculator.staticMethod(x,y);
        operator = Calculator::staticMethod; // (정적)메소드 참조

        int result = operator.applyAsInt(1,2);
        System.out.println("result: " + result);


        Calculator calculator = new Calculator(); // 객체 생성
        operator = (x, y) -> calculator.instanceMethod(x, y);
        operator = calculator::instanceMethod; // (인스턴스)메소드 참조

        int result2 = operator.applyAsInt(6,7);

        System.out.println("result: " + result2);
    }
}
