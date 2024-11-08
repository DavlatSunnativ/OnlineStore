import builder.OrderBuilder;
import command.*;
import controller.*;
import decorator.*;
import factory.UserFactory;
import models.*;
import observer.ProductNotifier;
import strategy.*;
import view.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        OrderController orderController = new OrderController();
        UserController userController = new UserController(new UserFactory());
        ProductView productView = new ProductView();
        UserView userView = new UserView();
        OrderView orderView = new OrderView();

        ProductNotifier productNotifier = new ProductNotifier();

        String userName = userView.getUserName();
        String userType = userView.getUserType();
        User user = userController.createUser(userName, userType);

        if (user != null) {
            productNotifier.registerUser(user);
            userController.handleUserAction(user);
            userView.displayUserInfo(user);
        }

        System.out.println("\nCreating an Order:");
        String productName = productView.getProductDescription();
        int quantity = orderView.getOrderQuantity();
        boolean giftWrap = orderView.getGiftWrapOption();
        boolean discount = orderView.getDiscountOption();

        Order order = new OrderBuilder(productName)
                .setQuantity(quantity)
                .setGiftWrap(giftWrap)
                .setDiscount(discount)
                .build();
        orderController.createOrder((Buyer) user, order);

        Cart cart = new Cart();
        Product sampleProduct = new Product(productName, 20.0);
        Command addToCart = new AddToCartCommand(cart, sampleProduct);
        addToCart.execute();
        cart.displayCart();

        Product decoratedProduct = new GiftWrapDecorator(new DiscountDecorator(sampleProduct, 0.10));
        System.out.println("Decorated product: " + decoratedProduct.getDescription() + " | Cost: $" + decoratedProduct.getCost());

        System.out.println("\nSelect payment method:");
        PaymentContext paymentContext = new PaymentContext();
        Scanner scanner = new Scanner(System.in);
        String paymentMethod = scanner.nextLine();

        if (paymentMethod.equalsIgnoreCase("paypal")) {
            paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
        } else if (paymentMethod.equalsIgnoreCase("creditcard")) {
            paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        }
        paymentContext.executePayment(decoratedProduct.getCost());

        productNotifier.addProduct("New Product Launch!");

        productController.addProduct(sampleProduct);
        productController.viewProducts();

        orderController.viewOrders();
        productController.applyDiscountToProduct(productName, 10.0);

        orderView.displayOrderDetails(order);
    }
}
