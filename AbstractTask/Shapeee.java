abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculatePerimeter() {
        return a + b + c;
    }
}

public class Shapeee {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}

