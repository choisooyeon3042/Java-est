package chap02;


public class ExampleNine {
    public static void main(String[] args) {
        int x = 1;
        int y = 20;
        int z = 300;

        // 값을 교환하는 코드
        int temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("x = " + x);  // 20
        System.out.println("y = " + y);  // 300
        System.out.println("z = " + z);  // 1
    }
}

