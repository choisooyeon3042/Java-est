package chap04;

import java.util.Scanner;

/*
* 사용자로부터 정수를 입력받고
* 그 숫자를 뒤집어서 출력하는 프로그램을 작성
* 입력 예시 12345
* 출력 예시 54321
* */
public class QuizExampleTest4 {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.print("입력: ");

         int number = sc.nextInt();

         int reverse = 0;
         while (number != 0) {
             int digit = number % 10; // 마지막 자리 숫자
             reverse = reverse * 10 + digit; // 숫자 뒤집기
             number /= 10; // 마지막 자리 제거
         }
         System.out.println(reverse);

         /* other code
         String str = args[0];
         for (int i = str.length() -1; i >= 0; i--) {
             System.out.print(str.charAt(i));
         }*/
     }
}
