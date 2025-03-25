package oopsPrograms;

abstract class Computer{

    abstract void turnignOff();
    abstract void turnOn();

}

class Hp extends Computer{
    @Override
    void turnOn() {
        System.out.println("Turning on HP");
    }

    @Override
    void turnignOff() {
        System.out.println("Turning off HP");
    }
}

class Lenovo extends Computer{
    @Override
    void turnOn() {
        System.out.println("Turing on lenovo");
    }

    @Override
    void turnignOff() {
        System.out.println("turning off lenovo");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Hp h1 = new Hp();
        h1.turnOn();
        h1.turnignOff();

        Lenovo ln = new Lenovo();
        ln.turnOn();
        ln.turnignOff();
    }
}


//we have an abstract classes with two abstract methods declared not defined abstract methods
// can be declared but definition takes place when we use them in subclasses
//abstract methods should be overriden in another class else you will end up getting error
