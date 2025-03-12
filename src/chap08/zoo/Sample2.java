package chap08.zoo;

public class Sample2 {
    public Predator predator;

    public Sample2(Predator predator) {
        this.predator = predator;
    }

    public static void main(String[] args) {
        Zookeeper2 zookeeper2 = new Zookeeper2();

        Predator lion2 = new Lion2();
        Predator tiger2 = new Tiger2();
        Predator crocodile = new Crocodile();

        zookeeper2.feed(lion2);
        zookeeper2.feed(tiger2);
        zookeeper2.feed(crocodile);
    }
}

class Zookeeper2 {
    public void feed(Predator predator) {
        System.out.println("feed " + predator.getFood()); // 다형성
    }
}

// 동물 클래스
class Tiger2 implements Predator {
    @Override
    public String getFood() {
        return "meat";
    }
}

class Lion2 implements Predator {
    @Override
    public String getFood() {
        return "fish";
    }
}

class Crocodile implements Predator {
    @Override
    public String getFood() {
        return "orange";
    }
}
