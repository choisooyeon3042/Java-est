package chap13.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
* 5부터 10까지의 숫자를 모두 더한 결과와
* 5부터 10까지의 모든 숫자를 출력
* */

public class StreamQuizExample {
    public static void main(String[] args) {
        /* 퀴즈 코드 */
        List<Integer> list = Arrays.asList(5, 6, 7, 8, 9, 10);

        int sum = list.stream()
                .peek(num-> System.out.print(num + " "))
                .mapToInt(Integer::intValue) // 가공 단계 없이
                .sum();
        System.out.println("합: " + sum);

        /* 강의 코드 */
        int result = IntStream.rangeClosed(5, 10)
                .peek(System.out::println)
                .sum();
        System.out.println("합: " + result);

    }
}
