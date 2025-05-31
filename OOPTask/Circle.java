package Lesson5Task.OOPTask;

public class Circle {
    private double rad;

    public void updateRadius(double value) {
        this.rad = value;
    }

    public double fetchRadius() {
        return rad;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(rad, 2);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * rad;
    }

    public static void main(String[] args) {
        Circle shape = new Circle();
        shape.updateRadius(5.0);

        System.out.println("Radius: " + shape.fetchRadius());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
    }
}
