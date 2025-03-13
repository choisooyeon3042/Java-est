package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionSample {
    public static void main(String[] args) {
        // File이 없는 예외 상황을 처리해야함
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("hi.txt"));
            System.out.println(reader.readLine());

            throw new IOException("IOException");

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾지 못했어요.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("파일을 읽다가 실패했어요.");
            System.out.println(e.getMessage());
        } finally {
            // JAVA 7버전 이후부터 문법 이상함을 느낌 자동 리소스 닫기를 지원함
            if (reader != null) {
                try{
                    reader.close(); // 메모리에 올라간 자료들 close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
