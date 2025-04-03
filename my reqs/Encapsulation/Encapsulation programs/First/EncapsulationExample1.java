// Encapsulated class
class Person {
    private String name; // Private variable

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

// Main class
public class EncapsulationExample1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John Doe");
        System.out.println("Person's Name: " + p.getName());
    }
}
