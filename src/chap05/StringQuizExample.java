package chap05;

public class StringQuizExample {
    public static void main(String[] args) {
        /*
        * aaaabbccd 문자열 한글자씩 출력
        * */
        String str = "aaaabbccdd";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
