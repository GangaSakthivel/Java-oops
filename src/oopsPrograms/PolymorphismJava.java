package oopsPrograms;

class A {
    void show(){
        System.out.println("A");
    }
        }

        class B extends A
        {
            void show(){
                System.out.println("B");
            }
        }

        class C extends B{
    void show(){
        System.out.println("C");
    }
        }

public class PolymorphismJava {
    public static void main(String[] args) {
        A a = new C();
        a.show();

    }
}
