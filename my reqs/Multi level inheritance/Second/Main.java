// Base class - Person
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class 1 - Employee (inherits from Person)
class Employee extends Person {
    String position;

    // Constructor
    public Employee(String name, int age, String position) {
        super(name, age);  // Call the constructor of Person
        this.position = position;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        displayPersonDetails();  // Call method from Person class
        System.out.println("Position: " + position);
    }
}

// Derived class 2 - Manager (inherits from Employee)
class Manager extends Employee {
    String department;

    // Constructor
    public Manager(String name, int age, String position, String department) {
        super(name, age, position);  // Call the constructor of Employee
        this.department = department;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        displayEmployeeDetails();  // Call method from Employee class
        System.out.println("Department: " + department);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of Manager (three-level inheritance)
        Manager manager = new Manager("John", 35, "Senior Manager", "Sales");

        // Call method to display details from all classes
        manager.displayManagerDetails();  // Displays all details
    }
}
