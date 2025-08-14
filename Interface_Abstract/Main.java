// Define the interface
interface Payment {
    void processPayment(double amount); // abstract method
}

// Class implementing the interface
class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }
}

// Another class implementing the interface
class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Using the interface reference
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();

        // Calling the methods
        p1.processPayment(50.00);
        p2.processPayment(75.50);

        // You can even swap implementations without changing other code
        Payment p3 = new CreditCardPayment();
        p3.processPayment(100.00);
    }
}
