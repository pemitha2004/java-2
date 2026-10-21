public class Bike extends Vehicle {

    // Constructor
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    // Method overriding
    @Override
    public void start() {
        System.out.println("Bike is starting with a kick");
    }
}