package chap13.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
*  List<String> 형태의 문자열 리스트가 주어졌을 때, 문자열의 길이가 5글자 이상인 것만 필터링하여 새로운 리스트 만들기
*  List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
*  결과 예시 [apple, banana, elephant]
* */
public class StreamQuizExample9 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant");

        List<String> result = words.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
