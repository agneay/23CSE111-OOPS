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

// Derived class 1 - Student (inherits from Person)
class Student extends Person {
    String course;

    // Constructor
    public Student(String name, int age, String course) {
        super(name, age);  // Call the constructor of Person
        this.course = course;
    }

    // Method to display student details
    public void displayStudentDetails() {
        displayPersonDetails();  // Call method from Person class
        System.out.println("Course: " + course);
    }
}

// Derived class 2 - GraduateStudent (inherits from Student)
class GraduateStudent extends Student {
    String thesisTitle;

    // Constructor
    public GraduateStudent(String name, int age, String course, String thesisTitle) {
        super(name, age, course);  // Call the constructor of Student
        this.thesisTitle = thesisTitle;
    }

    // Method to display graduate student details
    public void displayGraduateStudentDetails() {
        displayStudentDetails();  // Call method from Student class
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of GraduateStudent (three-level inheritance)
        GraduateStudent gradStudent = new GraduateStudent("Alice", 25, "Computer Science", "AI in Healthcare");

        // Call method to display details from all classes
        gradStudent.displayGraduateStudentDetails();  // Displays all details
    }
}
