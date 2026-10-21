public class Car extends Vehicle {

    int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("Car is starting with a key");
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Doors: " + doors);
    }
}