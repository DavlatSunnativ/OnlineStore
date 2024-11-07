package factory;

import models.Buyer;
import models.Salesman;
import models.User;

public class UserFactory {
    public static User createUser(String name, String userType) {
        if (userType.equalsIgnoreCase("Salesman")) {
            return new Salesman(name,"Salesman");
        } else if (userType.equalsIgnoreCase("Buyer")) {
            return new Buyer(name,"Buyer");
        } else {
            return null;
        }
    }
}
