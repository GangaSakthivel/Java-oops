package oopsPrograms;

class AnimalClass{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

//This is an example of method overriding and runtime polymorphism in Java.
class DogClass extends AnimalClass
{
    void sound(){
        System.out.println("Dog barks.");
    }
}

public class PracticeOne {

    public static void main(String[] args) {

        AnimalClass a1 = new DogClass();
        a1.sound();


    }


}
