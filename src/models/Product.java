package models;

public class Product {
    private String description;
    private double cost;

    public Product(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public void applyDiscount(double discountPercent) {
        this.cost -= this.cost * discountPercent / 100;
    }
}
