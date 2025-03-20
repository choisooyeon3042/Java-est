package chap13.quiz;

/*
 * Person 클래스의 리스트가 주어졌을때,
 * 나이가 28살 이상인 사람만 필터링하여 새로운 리스트 만들기
 * */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuizExample6 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 28)
        );

        List<String> names = people.stream()
                .filter(person -> person.age >= 28)
                .map(person -> person.name)
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
