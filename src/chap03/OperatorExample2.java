package chap03;

/**
 * 이항 연산자
 * 동등 비교 연산 - 실수, 문자열
 */
public class OperatorExample2 {
    public static void main(String[] args) {
        System.out.println(0.1 == 0.1f);   // false
        System.out.println(0.1 == 0.1);    // true

        // 문자열 동등 비교
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);       // false
        System.out.println(str1.equals(str2));  // true
    }
}