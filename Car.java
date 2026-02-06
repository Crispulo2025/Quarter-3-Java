public class Car {
    // Private attributes (cannot be accessed directly)
    private String brand;
    private int speed;

    // Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        setSpeed(speed); // Use setter to validate
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Setter for speed with validation
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative!");
        }
    }

    // Method to accelerate
    public void accelerate(int increase) {
        setSpeed(speed + increase);
        System.out.println("Speed increased to " + speed + " km/h.");
    }
}
