class Vehicle{
    public void drive(){
            System.out.println("vehicle driving.");
    }
}



    class Car extends Vehicle{

        public void display(){
            System.out.println("Car Details: ");
            System.out.println("Brand: Toyota");
            System.out.println("Model: Corolla");
            System.out.println("Year: 2022");
        }
    }



public class Main{
     public static void main(String[] args) {
        Car mycar = new Car();
        mycar.drive();
        mycar.display();
    }

}
    