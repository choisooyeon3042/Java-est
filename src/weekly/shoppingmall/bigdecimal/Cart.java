package weekly.shoppingmall.bigdecimal;

import java.math.BigDecimal;

public class Cart implements DeliveryChargeCalculator{
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    // 배송비 계산
    public BigDecimal calculateTotalDeliveryCharge() {
        // 1. 총 합 구하기 (무게/가격)
        BigDecimal totalPrice = BigDecimal.ZERO;
        double totalWeight = 0;
        for (Product product : products) {
            totalWeight += totalWeight + product.getWeight();
            totalPrice = totalPrice .add(product.getDiscountPrice());
        }

        // 2. 가격/무게에 따른 배송비 정책 적용해서 배송비 구하기
        return getDeliveryCharge(totalWeight, totalPrice);
    }

    @Override
    public BigDecimal getDeliveryCharge(Double totalWeight, BigDecimal totalPrice) {
        BigDecimal deliveryCharge = BigDecimal.ZERO;
        if (totalWeight < 3) {
            deliveryCharge = BigDecimal.valueOf(1000);
        } else if (totalWeight < 10) {
            deliveryCharge = BigDecimal.valueOf(5000);
        } else {
            deliveryCharge = BigDecimal.valueOf(10000);
        }

        // BigDecimal compareTo() -1, < 0, 1;
        if (totalPrice.compareTo(BigDecimal.valueOf(30000)) < 0)  {
            return deliveryCharge;
        } else if (totalPrice.compareTo(BigDecimal.valueOf(100000)) < 0) {
            return deliveryCharge.subtract(BigDecimal.valueOf(1000));
        } else {
            return BigDecimal.ZERO;
        }
    }
}
