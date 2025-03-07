package chap02;
import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        /* 언박싱 ? (참조 자료형->기본 자료형) */
        int integerValue2 = Integer.valueOf(10);
        System.out.println(integerValue2);
    }

}