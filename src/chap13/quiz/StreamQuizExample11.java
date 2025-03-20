package chap13.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* List<String> 형태의 문자열 리스트가 주어졌을 때 ,
* 특정 단어 (예: "apple")가 포함된 문자열만 필터링하기
* List<String> sentences = Arrays.asList("I like apples", "Bananas are tasty", "apple pie is delicious", "I have an apple");
* */
public class StreamQuizExample11 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("I like apples", "Bananas are tasty", "apple pie is delicious", "I have an apple");

        List<String> result = sentences.stream()
                .filter(sentence -> sentence.contains("apple"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
