package oopsPrograms;

abstract class AnimalSpecies{
    // Abstract method (no body → must be implemented by child classes)
    abstract public void makeSound();

    public void sleep(){
        System.out.println("Zzz");
    }

}

class Elephant extends AnimalSpecies{
    @Override
    public void makeSound() {
        System.out.println("Elephant making a sound");

    }
}

public class AbstractTwo {
    public static void main(String[] args) {
        Elephant e1 = new Elephant();
        e1.makeSound();
        e1.sleep();

    }
}
