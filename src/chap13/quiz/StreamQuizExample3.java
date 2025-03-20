package chap13.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* List<String>의 문장들을 단어로 나누어 (':' 구분자)
* 하나의 List<String>로 변환하세요.
* List<String> sentences = Arrays.asList("Hello:world", "Java:stream:flatMap", "Functional:programming");
*
* */
public class StreamQuizExample3 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello:world", "Java:stream:flatMap", "Functional:programming");

        List<String> word = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(":")))
                .collect(Collectors.toList());

        System.out.println(word);
    }
}
