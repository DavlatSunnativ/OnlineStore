package models;

public class Buyer extends User{
    public Buyer(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Buyer.");
    }

    public void viewProduct(Product product) {
        System.out.println(name + " is viewing the product: " + product.getDescription());
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order: " + order);
    }
}
