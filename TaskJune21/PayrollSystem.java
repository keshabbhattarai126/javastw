class Employee {
    double baseSalary;

    Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double performanceBonus;

    Manager(double baseSalary, double performanceBonus) {
        super(baseSalary);
        this.performanceBonus = performanceBonus;
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + performanceBonus;
    }
}