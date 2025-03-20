package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectExample {
    public static void main(String[] args) {
        // groupingBy
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);

        Set<Integer> set = list.stream()
                .filter(x -> x % 2 == 0) // 2, 2, 2, 4
                .collect(Collectors.toSet()); // set 객체로 만들어줌 - 중복 제거
        System.out.println("set 결과: " + set);

        List<Integer> resultList = list.stream()
                .filter(x -> x % 2 == 0) // 2, 2, 2, 4
                .collect(Collectors.toList()); // set 객체로 만들어줌 - 중복 제거
        System.out.println("list 결과: " + resultList);
        System.out.println();

        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()
                ));
        System.out.println("map 결과: " + map);
    }
}
