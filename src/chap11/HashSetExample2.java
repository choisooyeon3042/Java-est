package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        // 1. Set 객체 선언, 데이터 추가, 조회
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("DBMS");

        System.out.println("총 객체수: " + set.size()); // 4
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }
        
        // 2. 객체 삭제
        set.remove("DBMS");
        set.remove("Spring");

        System.out.println("총 객체수: " + set.size());
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }

        // 3. 객체 모두 삭제, 빈 set객체 확인
        set.clear();
        if (set.isEmpty()) {
            System.out.println("set 객체는 비어있습니다.");
        }
    }
}
