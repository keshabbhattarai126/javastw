abstract class RentalVehicle {
    abstract double calculateCost(int days);
}

class Car extends RentalVehicle {
    @Override
    double calculateCost(int days) {
        return 50 * days;
    }
}

class Motorcycle extends RentalVehicle {
    @Override
    double calculateCost(int days) {
        return 30 * days;
    }
}

class Bicycle extends RentalVehicle {
    @Override
    double calculateCost(int days) {
        return 10 * days;
    }
}