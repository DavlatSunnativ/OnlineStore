package controller;

import models.Buyer;
import models.Order;

import java.util.ArrayList;
import java.util.List;


public class OrderController {
    private List<Order> orders;

    public OrderController() {
        this.orders = new ArrayList<>();
    }

    public void createOrder(Buyer buyer, Order order) {
        orders.add(order);
        buyer.placeOrder(order);
        System.out.println("Order created for " + buyer.getName() + ": " + order);
    }

    public void viewOrders() {
        System.out.println("All orders:");
        for (Order order : orders) {
            System.out.println(" - " + order);
        }
    }

    public void viewOrdersByBuyer(Buyer buyer) {
        System.out.println("Orders for " + buyer.getName() + ":");
        for (Order order : orders) {
            // Additional filtering could be applied here based on the buyer
            System.out.println(" - " + order);
        }
    }
}
