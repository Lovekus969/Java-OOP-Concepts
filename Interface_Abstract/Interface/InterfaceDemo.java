// Define an interface for flying capability
interface Flyable {
    void fly();  // abstract method
}

// Define an interface for swimming capability
interface Swimmable {
    void swim();  // abstract method
}

// Define an interface for eating capability
interface Eatable {
    void eat();  // abstract method
}

// Class Duck implements MULTIPLE interfaces
class Duck implements Flyable, Swimmable, Eatable {
    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the pond!");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating grains!");
    }
}

// Another class Airplane implements only Flyable
class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying high!");
    }
}

// Main class to run program
public class InterfaceDemo {
    public static void main(String[] args) {
        // we cannot do: Flyable f = new Flyable();  (cannot instantiate interface)

        // Duck implements all 3 interfaces
        Duck d = new Duck();
        d.fly();   // Duck is flying in the sky!
        d.swim();  // Duck is swimming in the pond!
        d.eat();   // Duck is eating grains!

        // Airplane implements only Flyable
        Flyable plane = new Airplane();
        plane.fly();  // Airplane is flying high!
    }
}
