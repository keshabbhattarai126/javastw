abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    double side;

    Cube(double s) {
        this.side = s;
    }

    public double calculateVolume() {
        return side * side * side;
    }

    public double calculateArea() {
        return 6 * side * side;
    }

    public double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    double l, b, h;

    Cuboid(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public double calculateVolume() {
        return l * b * h;
    }

    public double calculateArea() {
        return 2 * (l*b + b*h + h*l);
    }

    public double calculatePerimeter() {
        return 4 * (l + b + h);
    }
}

class Cylinder extends Draw {
    double radius, height;

    Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius * 2;
    }
}

public class Draww {
    public static void main(String[] args) {
        Draw cube = new Cube(4);
        Draw cuboid = new Cuboid(3, 4, 5);
        Draw cylinder = new Cylinder(3, 7);

        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cuboid Area: " + cuboid.calculateArea());
        System.out.println("Cylinder Perimeter: " + cylinder.calculatePerimeter());
    }
}

