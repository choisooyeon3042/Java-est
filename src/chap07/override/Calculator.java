package chap07.override;

public class Calculator {
    static final double PI = 3.14;

    double areaCircle(double r) {
        System.out.println("Calculator.areaCircle");
        return r * r * PI;
    }
}
