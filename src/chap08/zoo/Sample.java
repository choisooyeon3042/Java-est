package chap08.zoo;

public class Sample {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Lion lion = new Lion();
        zookeeper.feed(lion);

        Tiger tiger = new Tiger();
        zookeeper.feed(tiger);
    }
}

// 사육사, 동물들
class Zookeeper {
    void feed(Tiger tiger) {
        System.out.println("feed meat");
    }
    void feed(Lion lion) {
        System.out.println("feed fish");
    }
}

class Tiger {

}

class Lion {

}