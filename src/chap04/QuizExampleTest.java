package chap04;

import java.util.Scanner;

/*
* 사용자로부터 정수 N을 입력 받고
* N! (팩토리얼) 값을 계산 하는 프로그램을 작성하세요!
* (팩토리얼: N! = N x (n-1) x ... x 1)
* 입력 예시 5
* 출력 예시 120
* */
public class QuizExampleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = sc.nextInt();

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
}