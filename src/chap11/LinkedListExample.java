package chap11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            arrayList.add(0, "첫번째 인덱스값");
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, "첫번째 인덱스값");
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
