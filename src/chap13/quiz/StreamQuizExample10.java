package chap13.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* List<Integer>가 주어졌을때, 리스트에서 10보다 크고 50보다 작은 숫자만 필터링
* List<Integer> numbers = Arrays.asList(5, 12, 25, 37, 48, 50, 63)
* 결과 예시 [12, 25, 37, 48]
*
* */
public class StreamQuizExample10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 25, 37, 48, 50, 63);

        List<Integer> result = numbers.stream()
                .filter(num -> num > 10 && num < 50)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
