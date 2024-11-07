package models;

public class Salesman extends User{
    public Salesman(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Salesman.");
    }

    public void addProduct(Product product) {
        System.out.println(name + " added a product: " + product.getDescription());
    }
}
