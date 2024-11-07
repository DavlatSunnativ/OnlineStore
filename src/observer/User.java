package observer;

public class User implements Observer {
    private String name;
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public void update(String productName) {
        System.out.println("Hello " + name + " (" + role + "), new product available: " + productName);
    }

    public String getRole() {
        return role;
    }
}
