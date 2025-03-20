package chap13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // 컬렉션 객체를 이용해서 스트림 생성
        List<String> list = Arrays.asList("a", "b", "c", "d");

//        for (String str : list) {
//            System.out.println(str);
//        }
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        System.out.println("===================");

        // 배열 객체를 이용해서 스트림 생성
        String[] arr = {"a2", "b2" , "c2", "d2"};

        Stream<String> stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);
        System.out.println("===================");

        // 숫자 범위로부터 스트림 생성
        IntStream intStream = IntStream.range(1, 6); // [1, 2, 3, 4, 5]
        LongStream longStream = LongStream.rangeClosed(1, 6); // [1, 2, 3, 4, 5, 6]
        DoubleStream doubleStream = new Random().doubles(5); // 난수 5개 생성

        intStream.forEach(System.out::println);
        System.out.println("===================");

        longStream.forEach(System.out::println);
        System.out.println("===================");

        doubleStream.forEach(System.out::println);
        System.out.println("===================");

        // 파일로부터 스트림 생성
        try {
            Stream<String> stream3 = Files.lines(Path.of("hi.txt"), Charset.forName("UTF-8"));
            stream3.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("파일 입출력 관련 오류 - " + e.getMessage());
            // e.printStackTrace();
        }
        System.out.println("===================");

        // 스트림 연결해서 새로운 스트림 생성
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> integerStream2 = Stream.of(21, 32, 43, 54, 65, 76);
        Stream<Integer> newStream = Stream.concat(integerStream1, integerStream2);

        newStream.forEach(System.out::println);
    }
}
