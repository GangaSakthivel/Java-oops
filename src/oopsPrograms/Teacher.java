package oopsPrograms;

//this keyword

public class Teacher {

    String myName;

    Teacher(){
        System.out.println("hello");
    }

    void display(){
        System.out.println("Display");
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println(t1.myName);

    }
}
