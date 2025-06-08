
class Shape1{
    void calculateArea(){
        System.out.println("area");
    }
}

class Rectangle1 extends Shape1{

    int length;
    int breadth;

    public Rectangle1(int len, int bre) {
        this.length= len;
        this.breadth = bre;
    }

    void calculateArea(){
        int area = length * breadth;
        System.out.println("Area: "+ area);
    }

    void calculatePerimeter(){
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: "+ perimeter);
    }

    

}

class Circle1 extends Shape1{
    double radius;

    public Circle1(double radius) {
        this.radius= radius;
    }

    
    void calculateArea(){
       double area =Math.PI * radius * radius;
       System.out.println("Area of circle: "+area);
    }

    void calculatePerimeter(){
        double perimeter = 2 * Math.PI* radius;
        System.out.println("Perimeter of circle: "+ perimeter);
    }

    
}



public class Shapes {
    public static void main(String[] args) {
        Rectangle1 rec1 = new Rectangle1(2, 04);
        rec1.calculateArea();
        rec1.calculatePerimeter();

        Circle1 circ = new Circle1(4.4);
        circ.calculateArea();
        circ.calculatePerimeter();
    }
}
