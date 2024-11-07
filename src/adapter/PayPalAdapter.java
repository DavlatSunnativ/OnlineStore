package adapter;

public class PayPalAdapter implements PaymentAdapter {
    private String email;

    public PayPalAdapter(String email) {
        this.email = email;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " for " + email);
        return true;
    }
}
