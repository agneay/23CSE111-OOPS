import java.util.concurrent.Flow.Subscriber;

interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class Demo implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo myDemoObj = new Demo();
        myDemoObj.myMethod();
        myDemoObj.myOtherMethod();
    }
}