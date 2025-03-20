package chap13.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* List<String> 형태의 문자열 리스트가 주어졌을 때,
* 각 문자열의 길이를 계산하여 길이가 5이하인 요소만 담아서 List<String>으로 변환하세요
* List<String> words = Arrays.asList("apple", "banana", "cherry");
* 결과 예시 [apple]
*  */
public class StreamQuizExample7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<String> result = words.stream()
                .filter(word -> word.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
