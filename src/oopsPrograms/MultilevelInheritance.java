package oopsPrograms;

class Vehicle{
    void start(){
        System.out.println("Vehicle is starting...");
    }

}

class Car extends Vehicle{

    void drive(){
        System.out.println("Drive the car.");
    }

}

class ElectricCar extends Car{
    void chargeBattery(){
        System.out.println("Electric car battery is changing. ");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {

        ElectricCar ev = new ElectricCar();
        ev.chargeBattery();
        ev.drive();

        Vehicle v1 = new Vehicle();
        v1.start();

        Car c1 = new Car();
        c1.drive();
        c1.start();

    }
}
