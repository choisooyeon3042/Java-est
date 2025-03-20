package chap13.quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
* List<String> 형태의 문자열 리스트가 주어졌을 때,
* 내림차순으로 정렬하고
* 모든 문자열을 대문자로 변환하세요.
* List<String> words = Arrays.asList("hello", "world", "java");
* 결과 예시 [WORLD, JAVA, HELLO]
* */
public class StreamQuizExample8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        List<String> result = words.stream()
                .sorted(Collections.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
