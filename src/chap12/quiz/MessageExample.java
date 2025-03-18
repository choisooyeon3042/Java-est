package chap12.quiz;

public class MessageExample {
    public static void main(String[] args) {
        Message message = name -> "안녕하세요!" + name;
        String result = message.getMessage("짱구 아버지");

        System.out.println(result);
    }
}
