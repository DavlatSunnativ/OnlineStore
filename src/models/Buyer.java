package models;

public class Buyer extends User{
    public Buyer(String name,String role) {
        super(name,role);
    }
    public void viewProduct(Product product) {
        System.out.println(name + " is viewing the product: " + product.getDescription());
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order: " + order);
    }
    @Override
    public void update(String productName) {
        System.out.println("Hello " + name + " (" + getRole() + "), new product available: " + productName);
    }
}
