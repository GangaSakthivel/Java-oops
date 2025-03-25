package oopsPrograms;

interface Drawable{
    void draw();
}

class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Square implements Drawable{
    @Override
    public void draw() {
        System.out.println("Square");
    }
}

public class InterfaceTwo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.draw();
        Square s1 = new Square();
        s1.draw();
    }


}
