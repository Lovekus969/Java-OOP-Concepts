// Driveable interface
interface Driveable {
    void startEngine() throws Exception; // Checked exception example
    void drive(int speed) throws IllegalArgumentException; // Unchecked exception example
    void stopEngine();
}
