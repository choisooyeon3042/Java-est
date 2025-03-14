package chap10;

public class GenericTypeExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("value");
        // int value = (int) box.get(); // box.get = Object타입이라 강제 타입 변환이 필요
        String value = (String) box.get();
        System.out.println("Generic Type 사용하지 않은 경우. value: " + value);

        Box<String> box2 = new Box<>();
        box2.set("문자열");
        String str = box2.get();
        System.out.println("Generic Type 사용. value: " + str);
    }
}
