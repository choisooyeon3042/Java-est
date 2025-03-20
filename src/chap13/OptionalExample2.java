package chap13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);

        if (optional.isPresent()) {
         //   System.out.println(optional.get());
        }

        String strDefault = optional.orElse("문자열");
        System.out.println("default value: " + strDefault);

        Optional<List<String>> optional2 = Optional.ofNullable(null);

        optional2.orElseGet(LinkedList::new)
                .forEach(System.out::println);

        optional2.orElseThrow(RuntimeException::new);

        // 빈 리스트를 제공하여 NullPointerException 방지
        // List<String> list = optional2.orElseGet(LinkedList::new);
        // list.forEach(System.out::println);

        // 안전한 예외 처리
        // try {
        //      optional2.orElseThrow(() -> new RuntimeException("리스트가 없습니다."));
        //  } catch (RuntimeException e) {
        //      System.out.println("예외 발생: " + e.getMessage());
        //  }

    }
}
