package weekly.shoppingmall.bigdecimal;

import java.math.BigDecimal;

public class ShoppingMall {
    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", BigDecimal.valueOf(30000), 2);   // 가격: 30000원, 무게: 2kg
        Product grocery = new Grocery("grocery", BigDecimal.valueOf(20000), 3); // 가격: 20000원, 무게: 3kg
        Product largeAppliance = new LargeAppliance("largeAppliance", BigDecimal.valueOf(50000), 5);  // 가격: 50000원, 무게: 5kg

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        BigDecimal totalDeliveryCharge = cart.calculateTotalDeliveryCharge();
        System.out.println("총 배송비 금액: " + totalDeliveryCharge);    // 최종 배송비 출력
    }
}
