
class Shape{

    int length;
    int breadth;
    int radius;

    Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        

    }

    Shape(int radius){
        this.radius= radius;
    }
}

class Rectangle extends Shape{

    Rectangle(int length, int breadth){
        super(length, breadth);

    }

    void calculateArea(){
         int x = length * breadth;
         System.out.println("Area of rectangle: "+ x);
    }
}

class Square extends Rectangle{

    Square(int length){
        super(length, length);

    }

    void calculateArea(){
        int area = length * length;
         System.out.println("Area of Square: " + area);

    }
}

class Circle extends Shape{
    Circle(int radius){
        super(radius);
    }

    void calculateArea(){
        double area = Math.PI* radius * radius;
        System.out.println("Area of Circle: " + area);

    }
}




public class Area3 {
    
    public static void main(String[] args) {
        
        
        Rectangle rec = new Rectangle(4, 4);
        rec.calculateArea();

        Square sq = new Square(6);
        sq.calculateArea();

        Circle c = new Circle(3);
        c.calculateArea();
    }
}
