package chap13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSortingExample {
    public static void main(String[] args) {
        String[] array = {"z", "f" , "a", "t", "c"};

        Arrays.stream(array)
                .sorted()
                .forEach(System.out::print);
        System.out.println("\n==================");

        Arrays.stream(array)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);
    }
}
