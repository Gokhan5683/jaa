// Abstract class Shape
abstract class Shape {
    int dimension1, dimension2;

    public Shape(int d1, int d2) {
        dimension1 = d1;
        dimension2 = d2;
    }

    abstract void printArea();
}

// Rectangle class
class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + (dimension1 * dimension2));
    }
}

// Triangle class
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * dimension1 * dimension2));
    }
}

// Circle class
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0); // Only radius is used
    }

    void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * dimension1 * dimension1));
    }
}

// Main class
class ShapeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        rectangle.printArea();

        Shape triangle = new Triangle(6, 4);
        triangle.printArea();

        Shape circle = new Circle(3);
        circle.printArea();
    }
}
