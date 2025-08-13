// OneToOneExample.java
import java.util.*;

class Passport {
    String passportNumber;
    Person owner; // one person

    Passport(String passportNumber, Person owner) {
        this.passportNumber = passportNumber;
        this.owner = owner;
    }
}

class Person {
    String name;
    Passport passport; // one passport

    Person(String name) {
        this.name = name;
    }
}

public class OneToOneExample {
    public static void main(String[] args) {
        // Create person
        Person person = new Person("John Doe");

        // Create passport and assign to person
        Passport passport = new Passport("P123456", person);
        person.passport = passport;

        // Output
        System.out.println("Person: " + person.name);
        System.out.println("Passport Number: " + person.passport.passportNumber);
        System.out.println("Passport Owner: " + passport.owner.name);
    }
}
