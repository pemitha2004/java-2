public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", 180, 4);

        Vehicle bike = new Bike("Honda", 120);

   
        System.out.println("----- CAR -----");
        car.displayInfo();
        car.start();

        System.out.println();

        System.out.println("----- BIKE -----");
        bike.displayInfo();
        bike.start();

        System.out.println();

        Vehicle vehicle = new Vehicle("Generic Vehicle", 100);

        System.out.println("----- ACCELERATION -----");

        vehicle.accelerate();
        vehicle.accelerate(20);
        vehicle.accelerate(30, "Sport");
    }
}