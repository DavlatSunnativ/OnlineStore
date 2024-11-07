package decorator;

import models.Product;

public class DiscountDecorator extends ProductDecorator {
    private double discountRate;

    public DiscountDecorator(Product product, double discountRate) {
        super(product);
        this.discountRate = discountRate;
    }

    @Override
    public double getCost() {
        return product.getCost() * (1 - discountRate); // Applying the discount
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", with discount";
    }
}
