package chap13.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* 이차원 컬렉션에 들어있는 정수들을 하나의 컬렉션으로 변환해주세요
* List<List<Integer>> numbers = Arrays.asList(
*       Arrays.asList(1, 2, 3),
*       Arrays.asList(4, 5, 6),
*       Arrays.asList(7, 8, 9)
* );
* */
public class StreamQuizExample4 {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flatNumbers = numbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("변환 결과: " + flatNumbers);
    }
}
