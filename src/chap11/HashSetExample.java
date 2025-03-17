package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("닝닝");
        set.add("카리나");
        set.add("윈터");

        // Iterator 객체
        Iterator<String> it = set.iterator();
        while (it.hasNext()) { // 저장된 객체 수만큼 루핑
            System.out.println(it.next()); // String 객체 하나를 가져옴
            it.remove();
        }
        System.out.println("size: " + set.size());

        // 향상된 for문으로 객체 출력
        for (String member : set) {  // 저장된 객체 수만큼 루핑
            System.out.println(member);
        }
    }
}
