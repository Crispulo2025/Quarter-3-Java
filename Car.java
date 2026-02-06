// Define the Car class
public class Car {
    // Attributes (fields)
    String color;
    String brand;
    int speed;
    double fuelLevel;

    // Constructor to create a Car object
    public Car(String color, String brand, int speed, double fuelLevel) {
        this.color = color;
        this.brand = brand;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    // Methods (behaviors)
    public void start() {
        System.out.println(brand + " car started.");
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println("Speed increased to " + speed + " km/h.");
    }

    public void brake(int decrease) {
        speed -= decrease;
        System.out.println("Speed decreased to " + speed + " km/h.");
    }

    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Fuel level: " + fuelLevel + " liters.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Red", "Toyota", 0, 10.0);

        // Use its methods
        myCar.start();
        myCar.accelerate(50);
        myCar.brake(20);
        myCar.refuel(15);
    }
}
