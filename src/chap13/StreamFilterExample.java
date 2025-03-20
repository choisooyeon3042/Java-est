package chap13;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("김밥", "김밥", "김치", "나비", "나방");
        list.stream()
                .filter(str -> str.startsWith("나"))
                .distinct()
                .forEach(System.out::println);
    }
}
