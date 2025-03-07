package chap05;

public class NullPointerExceptionSample {
    // Optional 객체를 한번 더 감싸줌 NFE 방지
    // field
    String field;

    public static void main(String[] args) {
        int[] array = new int[5];   // 객체(생성) 초기화를 반드시 해주자
        array[4] = 100;

        String str = "";            // 문자열 초기화
        System.out.println(str.equals(10));

        NullPointerExceptionSample sample = new NullPointerExceptionSample();
        sample.method();
        System.out.println(sample.field);
    }

    void method() {

    }
}
