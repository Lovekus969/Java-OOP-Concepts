class Driver {
    String name;
    Driver(String name) { this.name = name; }
}

class BMW {
    String model;
    BMW(String model) { this.model = model; }

    void assignDriver(Driver driver) {
        System.out.println(driver.name + " is driving " + model);
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        BMW car = new BMW("M4CS");
        Driver driver = new Driver("John");

        car.assignDriver(driver); // Association: BMW uses Driver
    }
}
