package view;

import models.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);

    public String getProductDescription() {
        System.out.print("Enter product description: ");
        return scanner.nextLine();
    }

    public double getProductPrice() {
        System.out.print("Enter product price: ");
        return scanner.nextDouble();
    }

    public double getDiscountPercentage() {
        System.out.print("Enter discount percentage: ");
        return scanner.nextDouble();
    }

    public void displayProductList(List<Product> products) {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(" - " + product.getDescription() + " | Price: $" + product.getCost());
        }
    }

    public void displayProductDetails(Product product) {
        System.out.println("Product Details:");
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: $" + product.getCost());
    }
}
