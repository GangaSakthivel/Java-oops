package oopsPrograms;

public class Student {

    String name;
    int rollNumber;
    String grade;

    Student(String name, int rollNumber, String grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    void studentDetails(){
        System.out.println("name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Grade: " + grade);

    }

    void updateGrade(String newGrade){
        this.grade = newGrade;
        System.out.println("Grade updated: " + newGrade);

    }

}
