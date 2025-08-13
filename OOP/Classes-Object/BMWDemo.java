import java.util.*;

// Abstract base class: BMW
abstract class BMW {
    String modelName;
    int topSpeed;

    // Parameterized constructor to initialize BMW
    BMW(String modelName, int topSpeed) {
        this.modelName = modelName;
        this.topSpeed = topSpeed;
        System.out.println("BMW Constructor called for " + modelName);
    }

    // Abstract method: display details (force child classes to implement)
    abstract void displayDetails();
}

// M4CS class extends BMW
class M4CS extends BMW {
    double zeroToHundred; // time in seconds

    // Parameterized constructor
    M4CS(int topSpeed, double zeroToHundred) {
        super("M4CS", topSpeed); // call parent constructor
        this.zeroToHundred = zeroToHundred;
    }

    // Implement abstract method
    void displayDetails() {
        System.out.println("Model: " + modelName);
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("0-100 km/h: " + zeroToHundred + " seconds");
        System.out.println();
    }
}

// M5CS class extends BMW
class M5CS extends BMW {
    double zeroToHundred;

    M5CS(int topSpeed, double zeroToHundred) {
        super("M5CS", topSpeed);
        this.zeroToHundred = zeroToHundred;
    }

    void displayDetails() {
        System.out.println("Model: " + modelName);
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("0-100 km/h: " + zeroToHundred + " seconds");
        System.out.println();
    }
}

// M8Competition class extends BMW
class M8Competition extends BMW {
    double zeroToHundred;

    M8Competition(int topSpeed, double zeroToHundred) {
        super("M8 Competition", topSpeed);
        this.zeroToHundred = zeroToHundred;
    }

    void displayDetails() {
        System.out.println("Model: " + modelName);
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("0-100 km/h: " + zeroToHundred + " seconds");
        System.out.println();
    }
}

// Main class to demonstrate objects and constructors
public class BMWDemo {
    public static void main(String[] args) {

        // Creating objects of different BMW models
        BMW car1 = new M4CS(280, 4.1);
        BMW car2 = new M5CS(305, 3.8);
        BMW car3 = new M8Competition(305, 3.2);

        // Polymorphism: calling same method on different objects
        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}
