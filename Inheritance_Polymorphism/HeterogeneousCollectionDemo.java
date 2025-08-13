import java.util.*;

public class HeterogeneousCollectionDemo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Animal());

        for (Animal animal : animals) {
            animal.speak(); // Calls appropriate version (Dog or Animal)
        }
    }
}
