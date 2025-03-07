package chap04;
/*
* 구구단
* */
public class GugudanExample {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            // 2*1 ~ 2*9
            for (int j = 1; j <= 9; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println(); // 엔터
        }
    }
}
