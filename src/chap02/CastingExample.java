package chap02;

/**
 * 2.3 타입 변환
 */
public class CastingExample {
    public static void main(String[] args) {
        // 강제 타입 변환 (long -> int)
        long longValue = 300;
        int intValue = (int) longValue;
        System.out.println(intValue);

        // double -> int
        double pi = 3.14;
        int pi2 = (int) pi;         // 값 손실 (소수점 사라짐)
        System.out.println(pi2);

        // 연산식에서 자동/강제 타입 변환
        int intValue2 = 10;
        double doubleValue = 5.5;
        double result = intValue2 + doubleValue;
        System.out.println(result);   // 15.5

        int intResult = intValue2 + (int) doubleValue;
        System.out.println(intResult);  // 15
    }
}