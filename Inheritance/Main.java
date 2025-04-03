class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tut! Tut!");
    }
}

public class Main extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Main myMainObj = new Main();
        myMainObj.honk();

        System.out.println(myMainObj.brand + " " + myMainObj.modelName);
    }
}