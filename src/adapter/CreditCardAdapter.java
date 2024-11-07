package adapter;

public class CreditCardAdapter implements PaymentAdapter {
    private String cardNumber;

    public CreditCardAdapter(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " for card number " + cardNumber);
        return true;
    }
}
