package command;

import models.Product;

public class AddToCartCommand implements Command {
    private Cart cart;
    private Product product;

    public AddToCartCommand(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.addProduct(product);
        System.out.println("Added product to cart: " + product.getDescription());
    }
}
