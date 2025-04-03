// Encapsulated class
class Employee {
    private String name;
    private int empID;
    private double salary;

    // Constructor
    public Employee(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getEmpID() {
        return empID;
    }

    public double getSalary() {
        return salary;
    }

    // Setter method for salary with validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }
}

// Main class
public class EncapsulationExample4 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 55000);

        // Accessing details via getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmpID());
        System.out.println("Employee Salary: $" + emp.getSalary());

        // Updating salary using setter
        emp.setSalary(60000);
        System.out.println("Updated Salary: $" + emp.getSalary());
    }
}
