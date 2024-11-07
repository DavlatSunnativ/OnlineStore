package view;

import models.Order;

import java.util.List;
import java.util.Scanner;

public class OrderView {
    private Scanner scanner = new Scanner(System.in);

    public int getOrderQuantity() {
        System.out.print("Enter quantity: ");
        return scanner.nextInt();
    }

    public boolean getGiftWrapOption() {
        System.out.print("Do you want gift wrap? (yes/no): ");
        String choice = scanner.next();
        return choice.equalsIgnoreCase("yes");
    }

    public boolean getDiscountOption() {
        System.out.print("Apply discount? (yes/no): ");
        String choice = scanner.next();
        return choice.equalsIgnoreCase("yes");
    }

    public void displayOrderDetails(Order order) {
        System.out.println("Order Summary:");
        System.out.println(order);
    }

    public void displayOrderList(List<Order> orders) {
        System.out.println("Order History:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
