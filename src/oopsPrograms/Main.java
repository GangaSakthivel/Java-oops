package oopsPrograms;

public class Main {
    public static void main(String[] args) {
//        Cars car1 = new Cars("Toyota", "Corolla", 2020);
//        Cars car2 = new Cars("Honda", "Civic", 2018);
//        car1.displayDetails();
//        car2.displayDetails();

//        Student s1 = new Student("Ganga", 1, "A");
//        Student s2 = new Student("Vino", 2, "B");
//        s1.studentDetails();
//        s1.updateGrade("A+");
//        s2.studentDetails();
//        s2.updateGrade("B");

//        PublicExample pe = new PublicExample();
//        System.out.println(pe.publicNumber);
//        pe.publicMethod();

//        PrivateExample p1 = new PrivateExample();
//        p1.privateMethod();

        // Try to access the private field directly (this will cause a compilation error)
        //System.out.println(pe.privateNumber);

       Parent p = new Parent();
       p.protectedMethod();

    }

}
