// Encapsulated class
class Student {
    private int age; // Private variable

    // Setter method with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age. Age must be positive.");
        }
    }

    // Getter method
    public int getAge() {
        return age;
    }
}

// Main class
public class EncapsulationExample2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        System.out.println("Student's Age: " + s.getAge());

        s.setAge(-5); // Invalid age input
    }
}
