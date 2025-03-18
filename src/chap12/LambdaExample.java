package chap12;

public class LambdaExample {
    public static void main(String[] args) {
        // 익명 구현 객체 선언
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 구현 객체 선언: runnable.run() 출력문");
            }
        };
        runnable1.run();
        System.out.println();

        // 람다식
        Runnable runnable2 = () -> System.out.println("람다식: runnable.run() 출력문");
        runnable2.run();

    }
}
