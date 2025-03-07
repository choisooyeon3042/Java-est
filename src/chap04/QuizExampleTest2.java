package chap04;

import java.util.Scanner;

/*
* 사용자로부터 숫자 N을 입력받고
* N단의 구구단을 출력하는 프로그램 작성
* 출력예시 5 x 1 = 5, 5 x 2 = 10;
* */
public class QuizExampleTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구구단 입력: ");
        int number = sc.nextInt(); // 사용자 입력 대기
        sc.close();

        for (int i = 1; i <= 9; i++) {
            System.out.print(number + " x " + i + " = " + (number * i));
            if (i < 9) {
                System.out.print(", ");
            }
            System.out.println();
        }
    }
}
