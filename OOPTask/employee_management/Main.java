package Lesson5Task.OOPTask.employee_management;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeName("Samriddha");
        employee.setEmployeeId("240488");
        employee.updateSalary(5000);

        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());

        employee.updateSalary(1500);
        System.out.println("Updated Salary: " + employee.getSalary());

        employee.updateSalary(-3000);
        System.out.println("Updated Salary: " + employee.getSalary());

        employee.updateSalary(-4000); 
        System.out.println("Final Salary: " + employee.getSalary());
    }
}
