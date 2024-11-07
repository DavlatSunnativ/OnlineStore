package models;

public class Order {
    private String productName;
    private int quantity;
    private boolean giftWrap;
    private boolean discount;

    public Order(String productName, int quantity, boolean giftWrap, boolean discount) {
        this.productName = productName;
        this.quantity = quantity;
        this.giftWrap = giftWrap;
        this.discount = discount;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isGiftWrap() {
        return giftWrap;
    }

    public boolean isDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Order [Product: " + productName + ", Quantity: " + quantity + ", Gift Wrap: " + giftWrap + ", Discount: " + discount + "]";
    }
}
