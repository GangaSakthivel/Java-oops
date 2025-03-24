package oopsPrograms;

//constructor overloading

public class ProgramOne {

    int marks;
    String name;

    ProgramOne(){
        System.out.println("Empty constructor. ");
    }

    ProgramOne(int a){
        System.out.println("Hello");
        System.out.println(a); //a = 10


    }

    public static void main(String[] args) {
        ProgramOne p1 = new ProgramOne(10); // object created and then default constructor would be called
        //passing a value through a constructor
        ProgramOne p2 = new ProgramOne();



    }


}
