class FordCar {

    // ==========================
    // Fields (State of the Car)
    // ==========================

    String model = "Ford Mustang";
    String color = "Blue";

    int speed = 0;
    int fuel = 100;
    int temperature = 22;

    boolean engineOn = false;
    boolean doorLocked = true;
    boolean headlightsOn = false;
    boolean acOn = false;
    boolean musicPlaying = false;
    boolean trunkOpen = false;

    // ==========================
    // Methods (Driver Functions)
    // ==========================

    void startEngine() {
        engineOn = true;
        System.out.println("Engine Started.");
    }

    void stopEngine() {
        engineOn = false;
        speed = 0;
        System.out.println("Engine Stopped.");
    }

    void accelerate() {
        if (engineOn) {
            speed += 20;
            fuel -= 2;
            System.out.println("Accelerating...");
        } else {
            System.out.println("Start the engine first.");
        }
    }

    void brake() {
        if (speed > 0) {
            speed -= 20;
            if (speed < 0)
                speed = 0;
            System.out.println("Brake Applied.");
        }
    }

    void lockDoors() {
        doorLocked = true;
        System.out.println("Doors Locked.");
    }

    void unlockDoors() {
        doorLocked = false;
        System.out.println("Doors Unlocked.");
    }

    void turnOnHeadlights() {
        headlightsOn = true;
        System.out.println("Headlights ON.");
    }

    void turnOffHeadlights() {
        headlightsOn = false;
        System.out.println("Headlights OFF.");
    }

    void turnOnAC() {
        acOn = true;
        System.out.println("AC Turned ON.");
    }

    void turnOffAC() {
        acOn = false;
        System.out.println("AC Turned OFF.");
    }

    void setTemperature(int temp) {
        temperature = temp;
        System.out.println("Temperature set to " + temperature + "°C");
    }

    void playMusic() {
        musicPlaying = true;
        System.out.println("Playing Music...");
    }

    void stopMusic() {
        musicPlaying = false;
        System.out.println("Music Stopped.");
    }

    void openTrunk() {
        trunkOpen = true;
        System.out.println("Trunk Opened.");
    }

    void closeTrunk() {
        trunkOpen = false;
        System.out.println("Trunk Closed.");
    }

    void honkHorn() {
        System.out.println("Beep! Beep!");
    }

    void showDashboard() {

        System.out.println("\n========== FORD DASHBOARD ==========");
        System.out.println("Model        : " + model);
        System.out.println("Color        : " + color);
        System.out.println("Engine       : " + (engineOn ? "ON" : "OFF"));
        System.out.println("Speed        : " + speed + " km/h");
        System.out.println("Fuel         : " + fuel + "%");
        System.out.println("Doors        : " + (doorLocked ? "Locked" : "Unlocked"));
        System.out.println("Headlights   : " + (headlightsOn ? "ON" : "OFF"));
        System.out.println("AC           : " + (acOn ? "ON" : "OFF"));
        System.out.println("Temperature  : " + temperature + "°C");
        System.out.println("Music        : " + (musicPlaying ? "Playing" : "Stopped"));
        System.out.println("Trunk        : " + (trunkOpen ? "Open" : "Closed"));
        System.out.println("====================================");
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating Object
        FordCar myCar = new FordCar();

        // Driver Starts Using the Car
        myCar.showDashboard();

        myCar.unlockDoors();
        myCar.startEngine();

        myCar.accelerate();
        myCar.accelerate();

        myCar.turnOnHeadlights();

        myCar.turnOnAC();
        myCar.setTemperature(18);

        myCar.playMusic();

        myCar.honkHorn();

        myCar.openTrunk();
        myCar.closeTrunk();

        myCar.brake();

        myCar.showDashboard();

        myCar.stopMusic();
        myCar.stopEngine();

        myCar.lockDoors();

        myCar.showDashboard();
    }
}
