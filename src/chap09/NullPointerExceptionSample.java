package chap09;
/*
* NPE - > 개발자 실수, 코드 작성 단계에서 발견하고 수정 필요
* */
public class NullPointerExceptionSample {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length());
    }
}
