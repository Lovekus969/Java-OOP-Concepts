// Step 1: Define an interface for payment
interface Payment {
    void pay(double amount);  // every payment type must implement this
}

// Step 2: Implement CreditCard payment
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

// Step 3: Implement PayPal payment
class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

// Step 4: Implement GooglePay payment
class GooglePayPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Google Pay.");
    }
}

// Step 5: A ShoppingCart class that uses the interface
class ShoppingCart {
    private Payment payment;  // reference to interface

    // Inject the payment method at runtime (dependency injection)
    public ShoppingCart(Payment payment) {
        this.payment = payment;
    }

    public void checkout(double amount) {
        payment.pay(amount);  // polymorphism in action
    }
}

// Main class
public class PaymentSystem {
    public static void main(String[] args) {
        // Use CreditCardPayment
        ShoppingCart cart1 = new ShoppingCart(new CreditCardPayment());
        cart1.checkout(150.75);  

        // Switch to PayPalPayment
        ShoppingCart cart2 = new ShoppingCart(new PayPalPayment());
        cart2.checkout(80.50);

        // Switch to GooglePayPayment
        ShoppingCart cart3 = new ShoppingCart(new GooglePayPayment());
        cart3.checkout(40.00);
    }
}
