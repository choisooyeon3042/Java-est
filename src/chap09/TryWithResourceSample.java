package chap09;

import java.io.IOException;

public class TryWithResourceSample {
    public static void main(String[] args) {
        try (FileInputStream reader = new FileInputStream("filename")) {
            reader.read(); // 1
            throw new Exception();
        } catch (Exception e) {
            System.out.println("IOException 발생!"); // 3
        }
    }
}
