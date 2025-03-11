package chap07.overload;
/**
 * 일반 클래스에서의 메소드 오버로딩
 */
public class Animal2 {
    private String name;

    void sleep() {

    }

    void sleep(int hour) {
        System.out.println(name + " Zzz.... for " + hour);
    }

    void sleep(int hour, int minute) {

    }

    void sleep(int hour, int minute, int second) {

    }
}
