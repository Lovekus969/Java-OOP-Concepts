// Abstract class
abstract class Vehicle {
    // Abstract method (no body)
    abstract void start();

    // Concrete method (with body)
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Subclass that extends the abstract class
class Car extends Vehicle {
    void start() {
        System.out.println("Car starting with key...");
    }
}

public class Maina {
    public static void main(String[] args) {
        Vehicle v = new Car(); // Polymorphism
        v.start(); // calls Car's start()
        v.stop();  // calls Vehicle's stop()
    }
}
