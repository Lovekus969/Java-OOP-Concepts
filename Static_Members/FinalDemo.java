// FinalDemo.java
// Demonstrates final class, final method, and attempt to extend it

// Final class - cannot be subclassed
final class BMW {
    // Final method - cannot be overridden
    final void startEngine() {
        System.out.println("BMW Engine Started!");
    }
}

//  Uncommenting this will cause a compile-time error
// class M4CS extends BMW {
//     void startEngine() { // Error: cannot override final method
//         System.out.println("M4CS Engine Started!");
//     }
// }

public class FinalDemo {
    public static void main(String[] args) {
        // Creating object of final class
        BMW car = new BMW();

        // Calling final method
        car.startEngine();

        // Explanation
        System.out.println("\nExplanation:");
        System.out.println("1. BMW is declared as final, so it cannot be subclassed.");
        System.out.println("2. startEngine() is declared as final, so it cannot be overridden.");
        System.out.println("3. Any attempt to extend BMW or override startEngine() will cause a compile-time error.");
    }
}
