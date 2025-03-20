package chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
* Optional을 이용한 NPE 방지
* */
public class OptionalExample3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        OptionalDouble avg = list.stream()
                .mapToInt(Integer::intValue)
                .average();
                // .orElse(0.0); // 2. 평균 값이 존재하지 않을 경우 0 사용
                // NoShuchElementExeption

//        if (avg.isPresent()) {
//            System.out.println(avg.getAsDouble()); 1. 값이 실제로 존재하는지 체크
//        }
        avg.ifPresent(System.out::println); // 3. 평균 값이 있을 경우에만 출력
        // avg.ifPresentOrElse(System.out::println, () -> System.out.println("값이 비었습니다")); // 3. 값이 없을때도 출력 가능
    }
}
