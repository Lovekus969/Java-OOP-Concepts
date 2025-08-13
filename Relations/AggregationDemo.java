class Radio {
    String brand;
    Radio(String brand) { this.brand = brand; }
}

class BMW {
    String model;
    Radio radio; // Aggregation

    BMW(String model, Radio radio) {
        this.model = model;
        this.radio = radio;
    }

    void showCarInfo() {
        System.out.println(model + " has a " + radio.brand + " radio");
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Radio radio = new Radio("Bose");
        BMW car = new BMW("M5CS", radio); // BMW aggregates Radio

        car.showCarInfo();
    }
}
