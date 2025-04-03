class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

class Cartoon {
    int x = 20;

    static class Mario {
        int y = 200;
    }
}



public class Main {
    public static void main(String[] args) {
        OuterClass myOuterClassObj = new OuterClass();
        OuterClass.InnerClass myInnerClassObj = myOuterClassObj.new InnerClass();
        System.out.println(myInnerClassObj.y);
        System.out.println(myOuterClassObj.x);

        Cartoon myCartoonbObj = new Cartoon();
        Cartoon.Mario myMarioObj = new Cartoon.Mario();
        System.out.println(myCartoonbObj.x);
        System.out.println(myMarioObj.y);
    }
}