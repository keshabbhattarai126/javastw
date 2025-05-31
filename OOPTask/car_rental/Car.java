package Lesson5Task.OOPTask.car_rental;

public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.isAvailable = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setRentalPricePerDay(double price) {
        if (price >= 0) {
            this.rentalPricePerDay = price;
        } else {
            System.out.println("Rental price cannot be negative.");
        }
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Car is already rented.");
        }
    }

    public void returnCar() {
        isAvailable = true;
    }
}
