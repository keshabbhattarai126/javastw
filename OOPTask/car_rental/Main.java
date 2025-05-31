package Lesson5Task.OOPTask.car_rental;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Land Cruiser V8");
        myCar.setRentalPricePerDay(45.99);

        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Rental Price per Day: $" + myCar.getRentalPricePerDay());
        System.out.println("Available: " + myCar.isAvailable());

        myCar.rent();
        System.out.println("Available after renting: " + myCar.isAvailable());

        myCar.returnCar();
        System.out.println("Available after returning: " + myCar.isAvailable());
    }
    
}
