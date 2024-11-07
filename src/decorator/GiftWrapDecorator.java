package decorator;

import models.Product;

public class GiftWrapDecorator extends ProductDecorator {

    public GiftWrapDecorator(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", with gift wrap";
    }

    @Override
    public double getCost() {
        return product.getCost() + 5.00;
    }
}
