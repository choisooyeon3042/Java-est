package chap11.queue;

public class Order {
    private String customerName;
    private String foodItem;

    public Order(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getFoodItem() {
        return foodItem;
    }
}
