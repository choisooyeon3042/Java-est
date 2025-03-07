package chap05;

import java.text.MessageFormat;

public class StringQuizExample2 {
    public static void main(String[] args) {
        /*
        * 단어 순서 뒤집기
        * "Hello Welcome java" ->
        * "Java Welcome Hello"
        * */

        String str = "Hello Welcome Java";
        String[] index = str.split(" ");

        String result = String.format("%s %s %s", index[2], index[1], index[0]);

        System.out.println(result);

    }
}
