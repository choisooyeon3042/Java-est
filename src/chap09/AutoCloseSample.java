package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseSample {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("hi.txt"))) {
            System.out.println(reader.readLine());

            throw new IOException("IOException");

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾지 못했어요.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("파일을 읽다가 실패했어요.");
            System.out.println(e.getMessage());
        }
    }
}
