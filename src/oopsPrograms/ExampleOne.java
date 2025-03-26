package oopsPrograms;

class ParentClass{
    ParentClass(){
        System.out.println("Parent Constructor");
    }
}

class ChildClass extends ParentClass{
    ChildClass(){
        System.out.println("Child constructor.");
    }
}

public class ExampleOne {
    public static void main(String[] args) {

        ChildClass c = new ChildClass();


    }
}


//When a Child object is created:
//
//Java first calls the parent class (Parent) constructor (implicitly, even if not written).
//
//Then, it executes the Child constructor.