package oopsPrograms;

public class ProgramTwo {

    int marks;
    String name;

    ProgramTwo(int a, String b){
        marks = a;
        name = b;
    }


    public static void main(String[] args) {
        ProgramTwo p1 = new ProgramTwo(90, "Peter");
        System.out.println(p1.marks);
        System.out.println(p1.name);
    }
}
