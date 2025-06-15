import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public double calculateArea() {
        return length * breadth;
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
}

public class Shapee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble(), b = sc.nextDouble();
        Rectangle rect = new Rectangle(l, b);
        System.out.println("Area of Rectangle: " + rect.calculateArea());

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Circle circle = new Circle(r);
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}

