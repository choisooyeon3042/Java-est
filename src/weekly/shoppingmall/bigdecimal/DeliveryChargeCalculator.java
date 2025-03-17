package weekly.shoppingmall.bigdecimal;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    BigDecimal getDeliveryCharge(Double weight, BigDecimal price);
}
