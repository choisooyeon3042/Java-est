package weekly.shoppingmall.bigdecimal;

import java.math.BigDecimal;

public abstract class Product implements Promotion{
    private String name;
    private BigDecimal price;
    private double weight;

    public Product(String name, BigDecimal price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

//    @Override
//    public BigDecimal getDiscountAmount() {
//        return BigDecimal.ZERO;
//    }
    public double getWeight() {
        return weight;
    }

    public BigDecimal getDiscountPrice() {
        // return price - getDiscountAmount();
        return price.subtract(getDiscountAmount());
    }
}
