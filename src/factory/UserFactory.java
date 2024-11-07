package factory;

import models.Buyer;
import models.Salesman;
import models.User;

public class UserFactory {
    public User createUser(String name, String userType) {
        if (userType.equalsIgnoreCase("Salesman")) {
            return new Salesman(name);
        } else if (userType.equalsIgnoreCase("Buyer")) {
            return new Buyer(name);
        } else {
            return null;
        }
    }
}
