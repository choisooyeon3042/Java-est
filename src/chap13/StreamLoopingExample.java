package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamLoopingExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        OptionalInt maxValueOpt = list.stream()
                .mapToInt(x -> x) // Integer::intValue 자동 형 변환
                .filter(x-> x % 2 == 0)
                .peek(System.out::println)
                .max();

        int maxValue = maxValueOpt.orElse(0);
        System.out.println("maxValue: " + maxValue);

    }
}
