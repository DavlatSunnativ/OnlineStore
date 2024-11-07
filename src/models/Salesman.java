package models;

public class Salesman extends User{
    public Salesman(String name,String role) {
        super(name,role);
    }


    public void addProduct(Product product) {
        System.out.println(name + " added a product: " + product.getDescription());
    }
    @Override
    public void update(String productName) {
        System.out.println("Hello " + name + " (" + getRole() + "), new product available: " + productName);
    }

}
