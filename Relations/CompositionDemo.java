class Engine {
    String type;
    Engine(String type) { this.type = type; }
}

class BMW {
    String model;
    Engine engine; // Composition

    BMW(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // engine created inside BMW
    }

    void showCarInfo() {
        System.out.println(model + " has an " + engine.type + " engine");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        BMW car = new BMW("M8 Competition", "V8 Twin Turbo");
        car.showCarInfo();
    }
}
