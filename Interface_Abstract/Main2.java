// Driveable interface
interface Driveable {
    void start();
    void accelerate(int speed);
    void brake();
}

// Car class implementing Driveable
class Car implements Driveable {
    public void start() {
        System.out.println("Car engine started with key...");
    }
    public void accelerate(int speed) {
        System.out.println("Car accelerating to " + speed + " km/h.");
    }
    public void brake() {
        System.out.println("Car is braking...");
    }
}

// Bike class implementing Driveable
class Bike implements Driveable {
    public void start() {
        System.out.println("Bike started by pedaling...");
    }
    public void accelerate(int speed) {
        System.out.println("Bike accelerating to " + speed + " km/h.");
    }
    public void brake() {
        System.out.println("Bike is braking...");
    }
}

// Main class
public class Main2{
    public static void main(String[] args) {
        // Using polymorphism — same interface, different implementations
        Driveable myCar = new Car();
        Driveable myBike = new Bike();

        // Car actions
        myCar.start();
        myCar.accelerate(80);
        myCar.brake();

        System.out.println();

        // Bike actions
        myBike.start();
        myBike.accelerate(25);
        myBike.brake();
    }
}
