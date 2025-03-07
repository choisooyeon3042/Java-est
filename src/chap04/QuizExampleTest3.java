package chap04;

import java.util.Scanner;

/*
* 사용자에게 정수를 입력받아서
* 다음과 같은 삼각형 별(*)을 출력
* 사용자가 5를 입력했을때
* *
* **
* ***
* ****
* *****
* */
public class QuizExampleTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
