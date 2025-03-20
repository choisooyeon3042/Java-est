package chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDistinctExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "b", "c", "d", "e", "e");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        List<String> arrayList = new ArrayList<>();
        arrayList.add("AAA");
        arrayList.add("BBB");
        arrayList.add("BBB");
        arrayList.add("CCC");
        arrayList.add("DDD");
        arrayList.add(new String("AAA"));

        arrayList.stream()
                .distinct()
                .forEach(System.out::println);
    }


}
