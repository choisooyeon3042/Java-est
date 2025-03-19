package chap12.methodref;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        function = (x, y) -> x.compareToIgnoreCase(y);
        function = String::compareToIgnoreCase; // 매개변수의 메소드 참조

        int value = function.applyAsInt("Spring", "SPRING");
        System.out.println("value: " + value);

    }
}
