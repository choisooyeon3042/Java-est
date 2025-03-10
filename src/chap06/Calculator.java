package chap06;

public class Calculator {
    static final double PI = 3.14;
    int result;

    // int postfixOperator(int a) {           // Primitive Type
    //    a++;
    //    return a;
    // }

    // 객체를 전달 받는 형태                     // Reference Type
    /* void postfixOperator(Calculator cal) { // cal 객체의 주소값을 들고 있음, 특정 개체 참조
         cal.result++;                        // 종료와 함께 값은 사라짐
    }*/

    // postfixOperator(); 로 변경하여 후위증가연산 결과를 얻을 수 있게
    void postfixOperator() {
        this.result++;
    }

    public static void main(String[] args) {
        Calculator sample = new Calculator();
        // int a = 1;
        // int result = sample.postfixOperator(a);
        // System.out.println(result);
        sample.result = 1;

        /* 객체를 전달 받는 형태
         sample.postfixOperator(sample);*/ // callByValue - 매개변수가 전달될때 값이 변경된다.
                                           // callByReference

        // postfixOperator(); 로 변경하여 후위증가연산 결과를 얻을 수 있게
        sample.postfixOperator();

        System.out.println(sample.result);

        System.out.println(PI);
    }
}
