package observer;

import java.util.ArrayList;
import java.util.List;

public class ProductNotifier {
    private List<models.User> observers;
    private String newProduct;

    public ProductNotifier() {
        observers = new ArrayList<>();
    }

    public void registerUser(models.User user) {
        observers.add(user);
    }

    public void removeUser(User user) {
        observers.remove(user);
    }

    public void notifyObservers() {
        for (models.User user : observers) {
            user.update(newProduct);
        }
    }

    public void addProduct(String productName) {
        this.newProduct = productName;
        System.out.println("New product added: " + productName);
        notifyObservers();
    }
}
