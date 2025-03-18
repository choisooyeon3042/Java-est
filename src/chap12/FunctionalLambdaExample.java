package chap12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalLambdaExample {
    public static void main(String[] args) {
        // Supplier<T>
        Supplier<String> supplier = () -> "리턴값만있음";
        System.out.println("supplier 실습 결과: " + supplier.get());

        // Consumer<T>
        Consumer<Integer> consumer = x -> System.out.println("consumer 매개값: " + x);

        consumer.accept(100);

        // Function<T, R>
        Function<Integer, String> function = a -> String.valueOf(a); // 메소드 참조: a -> String.valueOf(a); => String::valueOf
        String returnValue = function.apply(23);
        System.out.println("Function 타입 정의, 결과: " + returnValue);

        Function<String, Integer> function2 = x -> Integer.valueOf(x) + 50;
        int resultValue2 = function2.apply("800");
        System.out.println("Integer.valueOf(x) + 50의 결과: " + resultValue2);

        // Predicate<T>
        Predicate<Integer> predicate = x -> x % 2 == 1;
        if (predicate.test(1)) {
            System.out.println("1은 홀수입니다.");
        }
        
        Predicate<String> emptyStr = x -> x.length() == 0;
        System.out.println(emptyStr.test("짱구는 못말리자나아"));

    }
}
