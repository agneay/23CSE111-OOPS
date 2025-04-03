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

// Interface 1 - Employee (related to employee duties)
interface Employee {
    void work();  // Abstract method
}

// Interface 2 - Manager (related to managerial duties)
interface Manager {
    void manage();  // Abstract method
}

// Derived class - ManagerEmployee (inherits from Person, implements Employee and Manager interfaces)
class ManagerEmployee extends Person implements Employee, Manager {
    String department;

    // Constructor
    public ManagerEmployee(String name, int age, String department) {
        super(name, age);  // Call the constructor of Person
        this.department = department;
    }

    // Implement method from Employee interface
    public void work() {
        System.out.println(name + " is working in the department: " + department);
    }

    // Implement method from Manager interface
    public void manage() {
        System.out.println(name + " is managing the team in the " + department + " department.");
    }

    // Method to display manager-employee details
    public void displayManagerEmployeeDetails() {
        displayPersonDetails();  // Call method from Person class
        System.out.println("Department: " + department);
        work();  // Call work method from Employee interface
        manage();  // Call manage method from Manager interface
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of ManagerEmployee (hybrid inheritance)
        ManagerEmployee manager = new ManagerEmployee("John", 35, "Sales");

        // Call method to display details
        manager.displayManagerEmployeeDetails();  // Displays all details
    }
}
