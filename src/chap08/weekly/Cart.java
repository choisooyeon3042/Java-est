package chap08.weekly;

public class Cart {
    // 배송비를 계산하는 메소드만 구현
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateTotalDeliveryCharge() {
        int totalWeight = 0;
        int totalDiscountPrice = 0;

        for (Product product : products) {
            totalWeight += product.weight;
            totalDiscountPrice += product.price - product.getDiscountAmount();
        }

        int bsDeliveryCharge = calculateDeliveryCharge(totalWeight);
        int discountDeliveryCharge = bsDeliveryCharge;

        if (totalDiscountPrice >= 100000) {
            discountDeliveryCharge = 0;
        } else if (totalDiscountPrice >= 30000) {
            discountDeliveryCharge = bsDeliveryCharge - 1000;
        }

        System.out.println("총 무게: " + totalWeight + "kg, 총 할인된 가격: " + totalDiscountPrice + "원");
        System.out.println("기본 배송비: " + bsDeliveryCharge + "원, 할인된 배송비: " + discountDeliveryCharge + "원");

        return discountDeliveryCharge;
    }

    private int calculateDeliveryCharge(int totalWeight) {
        if (totalWeight < 3) {
            return 1000;
        } else if (totalWeight < 10) {
            return 5000;
        } else {
            return 10000;
        }
    }
}
