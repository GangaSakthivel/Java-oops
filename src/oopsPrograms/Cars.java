package oopsPrograms;

public class Cars {
    String make;
    String model;
    int year;

    Cars(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;

    }

    public void displayDetails(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }
}
