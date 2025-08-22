// Abstract class works as a SUPERCLASS
import java.util.*;
abstract class Animal {
    
    // Abstract method (no body) -> MUST be overridden by subclass
    abstract void makeSound();

    // Concrete method (has body) -> Subclass can directly use this
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass Dog extends abstract class Animal
class Dog extends Animal {
    @Override
    void makeSound() {  // Overriding abstract method
        System.out.println("Woof! Woof!");
    }
}

// Subclass Cat extends abstract class Animal
class Cat extends Animal {
    @Override
    void makeSound() {  // Overriding abstract method
        System.out.println("Meow! Meow!");
    }
}

// Main class
public class AbstractDemo {
    public static void main(String[] args) {
        // You cannot do: Animal a = new Animal();  (abstract classes cannot be instantiated)

        // Using superclass reference but subclass objects
        Animal dog = new Dog();
        dog.makeSound(); // Calls Dog's version -> Woof! Woof!
        dog.eat();       // Inherited from Animal -> This animal eats food.

        Animal cat = new Cat();
        cat.makeSound(); // Calls Cat's version -> Meow! Meow!
        cat.eat();       // Inherited from Animal -> This animal eats food.
    }
}
