package chap08.defaultmethod;

public class Zoo{
    public Predator predator;

    public Zoo(Predator predator) {
        this.predator = predator;
    }

    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Crocodile crocodile = new Crocodile();

        zookeeper.feed(lion);
        zookeeper.feed(tiger);
        zookeeper.feed(crocodile);
    }
}

class Zookeeper {
    void feed(Predator predator) {
        predator.printFood();
    }
}

// 동물 클래스
class Tiger implements Predator{
    @Override
    public String getFood() {
        return "meat";
    }
}

class Lion implements Predator{
    @Override
    public String getFood() {
        return "fish";
    }
}

class Crocodile implements Predator{
    @Override
    public String getFood() {
        return "orange";
    }
}
