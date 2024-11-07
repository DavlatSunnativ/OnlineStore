package command;

import models.Product;

public class RemoveFromCartCommand implements Command {
    private Cart cart;
    private Product product;

    public RemoveFromCartCommand(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.removeProduct(product);
        System.out.println("Removed product from cart: " + product.getDescription());
    }
}
