
class Vehicle2{

    public void startEngine(){
        System.out.println("Engine starts.");
    }

    public void stopEngine(){
        System.out.println("Stop Engine");
    }
}


class Car1 extends Vehicle2{
     
    public void drive(){
        System.out.println("Drive the car!");
    }
}

class Motorcycle extends Vehicle2{
    public void ride(){
        System.out.println("Ride a motorcycle!");
    }
}


public class Vehicle4 {
   public static void main(String[] args) {
       
    Vehicle2 vec = new Vehicle2();
    vec.startEngine();
    vec.stopEngine();


    Car1 car= new Car1();
    car.startEngine();
    car.drive();
    car.stopEngine();

    Motorcycle motor= new Motorcycle();
    motor.startEngine();
    motor.ride();
    motor.stopEngine(); 
   }
}
