package chap13.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Person 클래스의 리스트가 주어졌을때, 각 객체의 이름만 추출하여 List<String>으로 변환하세요
* */
public class StreamQuizExample5 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 28)
        );

        List<String> name = people.stream()
                .map(person -> person.name)
                .collect(Collectors.toList());

        System.out.println(name);
    }
}


