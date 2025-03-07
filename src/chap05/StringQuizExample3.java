package chap05;

public class StringQuizExample3 {
    public static void main(String[] args) {
        /*
        * 공백 제외해서 하나의 문자로 출력
        * "    Hello Welcome Java    " ->
        * "HelloWelcomeJava"
        * */

        String str = "    Hello Welcome Java    ";

        System.out.println(str.replaceAll(" ", ""));
    }
}
