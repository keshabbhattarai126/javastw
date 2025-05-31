package Lesson5Task.OOPTask.employee_management;

public class Employee {
    private String employeeName;
    private String employeeId;
    private double salary;

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeId(String id) {
        this.employeeId = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
        } else {
            System.out.println("Salary update denied: resulting salary cannot be negative.");
        }
    }
}
