package view;

import models.Salesman;
import models.User;

import java.util.Scanner;

public class UserView {
    private Scanner scanner = new Scanner(System.in);

    public String getUserName() {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public String getUserType() {
        System.out.print("Enter user type (Salesman/Buyer): ");
        return scanner.nextLine();
    }

    public void displayUserInfo(User user) {
        System.out.println("User Info:");
        System.out.println("Name: " + user.getName());
        System.out.println("Role: " + (user instanceof Salesman ? "Salesman" : "Buyer"));
    }

    public void showRoleActions(User user) {
        if (user instanceof Salesman) {
            System.out.println("Salesman Actions: Add Products, Manage Inventory");
        } else {
            System.out.println("Buyer Actions: Browse Products, Place Orders");
        }
    }
}
