package oopsPrograms;

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("Toyota", "Corolla", 2020);
        Cars car2 = new Cars("Honda", "Civic", 2018);
        car1.displayDetails();
        car2.displayDetails();
    }

}
