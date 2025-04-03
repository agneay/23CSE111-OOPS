public class Main {
    public static void main(String[] args) {
        Human myHuman = new Human("Agneay", 18);
        System.out.println("Name is: " + myHuman.getName());
        System.out.println("Age is :" + myHuman.getAge());
        myHuman.setAge(20);
        myHuman.setName("Agneay B Nair");
        // myHuman.Age = 18; Will return error
        // System.out.println(myHuman.age); will return error
        System.out.println("Name is: " + myHuman.getName());
        System.out.println("Age is :" + myHuman.getAge());
    }
}

class Human {
    private String name;
    private int Age;

    public Human(String myName, int myAge) {
        name = myName;
        Age = myAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String someName) {
        this.name = someName;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
}