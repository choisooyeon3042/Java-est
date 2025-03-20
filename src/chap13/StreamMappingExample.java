package chap13;

import java.util.Arrays;
import java.util.List;

public class StreamMappingExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("V", "I", "C", "T", "O", "R", "Y");

        List<String> newList = list.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(newList);
        System.out.println("================");

        String str2 = "Hello:World:Hi";
        String[] arr = str2.split(":");
        for (String element : arr) {
            System.out.println(element);
        }
        System.out.println("================");

        // flatMap
        List<String> list2 = Arrays.asList("Hello World", "Java stream");

        List<String> newList2= list2.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .toList();
                System.out.println(newList2);
    }
}
