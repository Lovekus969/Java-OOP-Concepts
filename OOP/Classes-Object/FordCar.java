class CruiseControl {

    boolean active = false;
    int targetSpeed;


    void activate(int speed) {
        active = true;
        targetSpeed = speed;

        System.out.println("Cruise Control ON");
        System.out.println("Target Speed: " + targetSpeed);
    }


    void deactivate() {
        active = false;
        System.out.println("Cruise Control OFF");
    }


    void maintainSpeed(FordCar car) {

        if(active) {

            if(car.speed < targetSpeed) {

                car.speed += 5;
                System.out.println(
                    "Cruise Control Increasing Speed: "
                    + car.speed
                );

            }

            else if(car.speed > targetSpeed) {

                car.speed -= 5;
                System.out.println(
                    "Cruise Control Reducing Speed: "
                    + car.speed
                );
            }

            else {
                System.out.println(
                    "Speed maintained: " 
                    + car.speed
                );
            }
        }
    }
}


class SafetySensor {

    boolean obstacleDetected = false;


    void detectObstacle() {

        obstacleDetected = true;

        System.out.println(
            "Obstacle detected!"
        );
    }


    void stopCar(FordCar car) {

        if(obstacleDetected) {

            car.speed = 0;

            System.out.println(
                "Automatic Emergency Stop Activated"
            );
        }
    }
}



public class FordCar {


    int speed = 0;
    boolean engineOn = false;


    // Creating objects
    CruiseControl cruiseControl;
    SafetySensor sensor;



    // Constructor

    FordCar(){

        cruiseControl = new CruiseControl();

        sensor = new SafetySensor();

    }



    void startEngine(){

        engineOn = true;

        System.out.println(
            "Engine Started"
        );
    }



    void accelerate(){

        if(engineOn){

            speed += 10;

            System.out.println(
                "Speed: " + speed
            );
        }

    }



    void brake(){

        speed -= 10;

        if(speed < 0)
            speed = 0;


        System.out.println(
            "Brake Applied"
        );
    }



    void showDashboard(){

        System.out.println(
            "Current Speed: " + speed
        );

    }



    public static void main(String args[]){


        // Creating Ford object

        FordCar myFord = new FordCar();



        myFord.startEngine();



        myFord.accelerate();

        myFord.accelerate();

        myFord.accelerate();



        // Enable Cruise Control

        myFord.cruiseControl.activate(50);



        // Cruise control maintains speed

        myFord.cruiseControl.maintainSpeed(myFord);



        myFord.cruiseControl.maintainSpeed(myFord);



        // Sensor detects obstacle

        myFord.sensor.detectObstacle();



        // Automatic stop

        myFord.sensor.stopCar(myFord);



        myFord.showDashboard();

    }
}