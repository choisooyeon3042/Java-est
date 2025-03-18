package chap11.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("흰둥이");
        queue.offer("봉미선");
        queue.offer("신형만");
        queue.offer("신짱구");
        queue.offer("신짱아");

        System.out.println(queue.peek());
        System.out.println();

        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println(element);
        }
    }
}
