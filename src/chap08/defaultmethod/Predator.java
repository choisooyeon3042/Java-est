package chap08.defaultmethod;

interface Predator {
    static final double NUMBER = 3; // 상수 값 선언 가능

    String getFood();
    
    // 디폴트 메소드
    default void printFood() {
        System.out.println("feed " + getFood()); // 다형성
    }
 }
