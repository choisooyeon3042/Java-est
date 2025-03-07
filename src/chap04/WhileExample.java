package chap04;

public class WhileExample {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        while (number <= 30) {
            System.out.println(number);
            number++;
        }
        
        // do-while문으로 1~30 출력

        int i = 0;

        do {
            i++;
            System.out.println(i);
        } while (i < 30);
    }
}
