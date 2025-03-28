package weekly.shoppingmall.bigdecimal;

import java.math.BigDecimal;

public class LargeAppliance extends Product {
    public LargeAppliance(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

    @Override
    public BigDecimal getDiscountAmount() {
        return BigDecimal.valueOf(0);
    }
}
