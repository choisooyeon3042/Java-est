package chap11;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동", 70);
        map.put("카리나", 85);
        map.put("제시카", 95);
        map.put("홍길동", 80);
        System.out.println("map size: " + map.size()); // key가 중복되면 마지막 값 반영

        // 2. 객체 찾기 : get(), getOrDefault() 메소드 이용
        System.out.println("\t카리나: " + map.get("카리나"));
        System.out.println("\t지젤 점수: " + map.getOrDefault("지젤", 0));
        System.out.println("\t홍길동 포함여부: " + map.containsKey("홍길동")); // true
        System.out.println();

        // 3. 객체를 하나씩 처리 : keySet() 메소드 이용
        Set<String> keySet = map.keySet();
        Iterator<String> keyiterator = keySet.iterator();
        while (keyiterator.hasNext()) {
            String key = keyiterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        // 4. 특정 객체 삭제 : remove() 메소드 이용
        map.remove("홍길동");
        System.out.println("map size: " + map.size());

        // 5. 객체를 하나씩 처리 : entrySet() 메소드 이용
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.EntrySet 얻기
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("\t" + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("=============");
        System.out.println();

        // 6. 모든 Map.Entry 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("map 객체는 비어있음");
        }

    }
}
