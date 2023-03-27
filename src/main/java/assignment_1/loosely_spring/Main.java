package assignment_1.loosely_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
class Key {

    @Autowired
    Vehicle vehicle;
    public Key(Vehicle vehicle) {

        this.vehicle=vehicle;
        this.vehicle.start();
    }

}

interface Vehicle{
    void start();
}
@Component
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is running");
    }

}
@Component
@Primary
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is running");
    }

}
@Component
class Truck implements Vehicle {
    public void start() {
        System.out.println("Truck is running");
    }
}

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Main.class,args);
        Key key = applicationContext.getBean(Key.class);



    }
}

