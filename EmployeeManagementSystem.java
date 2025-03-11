package AssignmentAnswers;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("---------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(1, "John Doe", 50000.0);
        Employee emp2 = new Employee(2, "Jane Smith", 60000.0);
        Employee emp3 = new Employee(3, "Alice Johnson", 55000.0);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}