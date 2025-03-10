package chap06;

public class KoreaPeople {
    // final String nation;
    final String nation = "america";
    String name;

    // 생성자
    KoreaPeople(String name) {
        this.name = name;

        // final 필드 초기화
        // nation = "Java World";
    }

    public static void main(String[] args) {
        KoreaPeople people = new KoreaPeople("수연");
        System.out.println(people.name);
        System.out.println(people.nation);
    }
}
