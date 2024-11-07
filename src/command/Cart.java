package command;

import models.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayCart() {
        System.out.println("Cart contents:");
        for (Product product : products) {
            System.out.println(" - " + product.getDescription() + " | Price: $" + product.getCost());
        }
    }
}
