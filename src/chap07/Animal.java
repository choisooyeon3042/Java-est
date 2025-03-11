package chap07;

public class Animal {
    String name;

//    Animal() {
//        System.out.println("Animal constructor");
//    }
    Animal(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(name + " sleep Zzz...");
    }
}
