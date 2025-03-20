package chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> empty = Optional.empty();

        String str = null;
        Optional<String> optional1 = Optional.ofNullable(str);

        String str2 = "";
        Optional<String> options2 = Optional.of(str2);

        List<String> list = null;

        Optional.ofNullable(list)
                .orElse(new ArrayList<>())
                .forEach(System.out::println);

    }
}
