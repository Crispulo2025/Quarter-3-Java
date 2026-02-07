class Vehicle {
    int speed;
    String color;

    void start() {
        System.out.println("Vehicle started.");
    }

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    void airConditioning() {
        System.out.println("Air conditioning turned on.");
    }
}

class Motorcycle extends Vehicle {
    void kickStart() {
        System.out.println("Motorcycle kick-started.");
    }
}

// Public class name matches the filename
public class VehiclesDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.start();
        myCar.airConditioning();

        Motorcycle myBike = new Motorcycle();
        myBike.color = "Blue";
        myBike.start();
        myBike.kickStart();
    }
}
