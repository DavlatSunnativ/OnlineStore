package builder;

import models.Order;

public class OrderBuilder {
    private String productName;
    private int quantity = 1; // Default quantity
    private boolean giftWrap = false; // Default no gift wrap
    private boolean discount = false; // Default no discount

    public OrderBuilder(String productName) {
        this.productName = productName;
    }

    public OrderBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderBuilder setGiftWrap(boolean giftWrap) {
        this.giftWrap = giftWrap;
        return this;
    }

    public OrderBuilder setDiscount(boolean discount) {
        this.discount = discount;
        return this;
    }

    public Order build() {
        return new Order(productName, quantity, giftWrap, discount);
    }
}
