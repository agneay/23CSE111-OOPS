// Class with Constructors
class Student {
    String name;
    int age;

    // Default Constructor (No parameters)
    Student() {
        System.out.println("Default Constructor called.");
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        System.out.println("Parameterized Constructor called.");
        name = n;
        age = a;
    }

    // Copy Constructor
    Student(Student s) {
        System.out.println("Copy Constructor called.");
        name = s.name;
        age = s.age;
    }

    // Display Method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Using Default Constructor
        Student s1 = new Student();
        s1.display();

        // Using Parameterized Constructor
        Student s2 = new Student("Alice", 20);
        s2.display();

        // Using Copy Constructor
        Student s3 = new Student(s2);
        s3.display();
    }
}
