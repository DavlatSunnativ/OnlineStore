package models;
public abstract class User {
    protected String name;
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }


    public String getRole() {
        return role;
    }

    public abstract void update(String productName);
}
