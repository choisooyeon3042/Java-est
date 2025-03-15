package chap08.weekly;

public abstract class Product implements Promotion{
    protected String name;
    protected int price;
    protected int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
}
