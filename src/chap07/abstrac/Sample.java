package chap07.abstrac;

public class Sample {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();

        bird.sound();
        cat.sound();

        Animal bird2 = new Bird();
        Animal cat2 = new Cat();
        bird2.sound();
        cat2.sound();
    }
}
