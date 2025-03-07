package chap02;
/*
    실수 타입 변수
*/
public class DoubleFloatVariableExample {
    public static void main(String[] args) {
        // 실수 타입 선언
        double d1 = 3.14;
        float d2 = 3.14F;

        // 정밀도 테스트
        double d3 = 0.123456789123456789;
        float d4 = 0.123455678123456789f;

        System.out.println(d3);
        System.out.println(d4);
    }
}
