package controller;

import factory.UserFactory;
import models.Buyer;
import models.Salesman;
import models.User;

public class UserController {
    private UserFactory userFactory;

    public UserController(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

    public User createUser(String name, String userType) {
        User user = userFactory.createUser(name, userType);
        if (user != null) {
            System.out.println("User created: " + user.getName());
            user.displayRole();
        } else {
            System.out.println("Invalid user type.");
        }
        return user;
    }

    public void handleUserAction(User user) {
        if (user instanceof Salesman) {
            System.out.println("Salesman actions available.");
        } else if (user instanceof Buyer) {
            System.out.println("Buyer actions available.");
        }
    }
}
