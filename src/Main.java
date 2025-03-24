addclass Animal { //package private access
    public String name; //this is a public attribute

    Animal(String name){
        this.name = name;

    }

    public void makeSound(){
        System.out.println(name + " is making a sound");
    }
}


public class Main {

    public static void main(String[] args)
    {
        Animal a1 = new Animal("Elephant");// direct access to public field
        a1.makeSound();

    }
}