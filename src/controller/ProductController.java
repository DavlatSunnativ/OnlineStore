package controller;

import models.Product;


import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products;

    public ProductController() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getDescription());
    }

    public void viewProducts() {
        System.out.println("Available products:");
        for (Product product : products) {
            System.out.println(" - " + product.getDescription() + " | Price: $" + product.getCost());
        }
    }

    public void applyDiscountToProduct(String productDescription, double discountPercent) {
        for (Product product : products) {
            if (product.getDescription().equalsIgnoreCase(productDescription)) {
                product.applyDiscount(discountPercent);
                System.out.println("Discount applied to " + product.getDescription() + ": New Price = $" + product.getCost());
                return;
            }
        }
        System.out.println("Product not found: " + productDescription);
    }
}
