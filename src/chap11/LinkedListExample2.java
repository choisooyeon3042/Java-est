package chap11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            arrayList.add("첫번째 인덱스값");
        }
        System.out.println("ArrayList: " + (System.nanoTime() - startTime) + "ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add("첫번째 인덱스값");
        }
        System.out.println("LinkedList: " + (System.nanoTime() - startTime) + "ns");
    }
}
