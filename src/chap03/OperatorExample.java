package chap03;

public class OperatorExample {
    public static void main(String[] args) {
        // 부호 연산자
        int x = 800;
        int result1 = +x;
        int result2 = -x;
        System.out.println(result1);
        System.out.println(result2);

        // 증감 연산자
        int num = 10;
        System.out.println(num++); // 10
        System.out.println(++num); // 12
        int value = num++;
        System.out.println(value); // 12
        System.out.println(num); // 13
    }
}
