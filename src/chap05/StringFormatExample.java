package chap05;

import java.text.MessageFormat;

public class StringFormatExample {
    public static void main(String[] args) {
        String name = "Tim";
        int age = 30;
        String str = String.format("%s의 나이는 %s세 입니다.", name, age);
        System.out.println(str);

        System.out.printf("%s의 나이는 %s세 입니다.", name, age);
        System.out.println();

        String formatResult = MessageFormat.format("{0}의 나이는 {1}세 입니다.", name, age);
        System.out.println(formatResult);
    }
}
