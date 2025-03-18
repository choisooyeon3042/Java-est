package chap11.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {
    public static void main(String[] args) {
        Queue<Order> deliveryQueue = new LinkedList<>();

        deliveryQueue.offer(new Order("신형만", "피자"));
        deliveryQueue.offer(new Order("봉미선", "짜장면"));
        deliveryQueue.offer(new Order("짱구", "초코픽"));

        while (!deliveryQueue.isEmpty()) {
            Order delivery = deliveryQueue.poll();
            System.out.println(delivery.getCustomerName() + "에게 " + delivery.getFoodItem() + " 배달중 입니다.");

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                /* Do something */
//            }
        }

        System.out.println("모든 주문이 배달 완료 되었습니다.");
    }
}
