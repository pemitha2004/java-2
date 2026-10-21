public class Vehicle {

    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void accelerate() {
        System.out.println("Accelerating by default amount");
    }

    public void accelerate(int amount) {
        System.out.println("Accelerating by " + amount);
    }

    public void accelerate(int amount, String mode) {
        System.out.println("Accelerating by " + amount + " in " + mode + " mode");
    }
}