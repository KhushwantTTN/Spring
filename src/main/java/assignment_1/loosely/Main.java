package assignment_1.loosely;

class Key {

    Vehicle vehicle;
    public Key(Vehicle vehicle) {

        this.vehicle=vehicle;
        this.vehicle.start();
    }
}

interface Vehicle{
    void start();
}
class Bike implements Vehicle{
    public void start() {
        System.out.println("Bike is running");
    }

}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is running");
    }

}

class Truck implements Vehicle{
    public void start() {
        System.out.println("Truck is running");
    }
}


public class Main {

    public static void main(String[] args) {

        Key cr = new Key(new Bike());
        Key cr2 = new Key(new Car());
        Key cr3 = new Key(new Truck());


    }
}
