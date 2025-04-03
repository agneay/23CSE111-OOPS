class Vehicle {
    public void dispInfo() {
        System.out.println("hello I am vehicle");
    }
}

public class Main extends Vehicle {
    @Override
    public void dispInfo() {
        System.out.println("I am a main class");
    }

    public static void main(String[] args) {
        Main myMainObj = new Main();
        myMainObj.dispInfo();6
    }
}