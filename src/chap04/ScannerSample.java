package chap04;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputValue = sc.nextLine();

        // inputValue 활용 = 사용자로부터 입력받은 값 활용 가능
        System.out.println(inputValue);
    }
}
