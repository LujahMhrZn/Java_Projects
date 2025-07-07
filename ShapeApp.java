abstract class Shape{
    abstract void drawshape();

    void circle(){
        System.out.println("Drawing Circle");
    }

    void square(){
        System.out.println("Drawing Square");
    }
}

class Triangle extends Shape {
    void drawshape() {
        System.out.println("Drawing Triangle");
    }
} 

class Rectangle extends Shape {
    void drawshape() {
        System.out.println("Drawing Rectangle");
    }
}

public class ShapeApp{
    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.drawshape();
        shape.circle();
        shape = new Rectangle();
        shape.drawshape();
        shape.square();
}
}