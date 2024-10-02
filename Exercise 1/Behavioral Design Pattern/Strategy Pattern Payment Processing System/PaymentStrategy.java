// Payment Strategy Interface
interface PaymentStrategy {
    void pay(double amount);
}

// Concrete Strategy: Credit Card Payment
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

// Concrete Strategy: PayPal Payment
class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Concrete Strategy: Cryptocurrency Payment
class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cryptocurrency.");
    }
}

// Context: Shopping Cart
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Execute the payment
    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}

// Main Class to Demonstrate the Strategy Pattern
public class StrategyPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Use Credit Card Payment Strategy
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(150.0);

        // Switch to PayPal Payment Strategy
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200.0);

        // Switch to Cryptocurrency Payment Strategy
        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(250.0);
    }
}
