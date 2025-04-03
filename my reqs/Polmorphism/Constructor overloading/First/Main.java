// Class with Constructor Overloading
class Person {
    String name;
    int age;
    String city;

    // Constructor 1: No parameters (Default Constructor)
    Person() {
        System.out.println("Default Constructor called.");
        name = "Unknown";
        age = 0;
        city = "Not Specified";
    }

    // Constructor 2: Parameterized Constructor (name & age)
    Person(String n, int a) {
        System.out.println("Constructor with Name & Age called.");
        name = n;
        age = a;
        city = "Not Specified";
    }

    // Constructor 3: Parameterized Constructor (name, age & city)
    Person(String n, int a, String c) {
        System.out.println("Constructor with Name, Age & City called.");
        name = n;
        age = a;
        city = c;
    }

    // Display Method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Using Default Constructor
        Person p1 = new Person();
        p1.display();

        // Using Constructor with Name & Age
        Person p2 = new Person("Alice", 25);
        p2.display();

        // Using Constructor with Name, Age & City
        Person p3 = new Person("Bob", 30, "New York");
        p3.display();
    }
}
