package chap09;

public class FileInputStream implements AutoCloseable{
    String fileName;

    FileInputStream(String fileName) {
        this.fileName = fileName;
    }

    public void read() {
        System.out.println("파일을 읽습니다!");
    }

    @Override
    public void close() throws Exception {
        System.out.println("파일 자원을 자동으로 닫아줍니다.*"); // 2
    }
}
