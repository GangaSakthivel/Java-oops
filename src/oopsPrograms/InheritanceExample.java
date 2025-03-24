package oopsPrograms;

class Animal{ //parent class

    String name;


    void eat(){
        System.out.println(name + " Is eating");
    }

}

class Dog extends Animal {
    void bark(){
        System.out.println(name + " is barking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Buddy";
        d1.bark(); //own method
        d1.eat(); //inherited method

        Animal a1 = new Animal();
        a1.name = "Elephant";
        a1.eat();


    }
}
