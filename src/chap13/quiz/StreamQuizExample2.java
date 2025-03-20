package chap13.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
* List<Integer>가 주어졌을 때, 각 숫자를 제곱한 값의 리스트로 변환
* 결과 예시 [1, 4, 9, 16, 25]
* */
public class StreamQuizExample2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numberSquare = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("결과: " + numberSquare);
    }
}
