package OOPS.Interfaces.Extends_Demo;

public class Main implements B {

    @Override
    public void fun() {
        System.out.println("Hello lets have fun.");
    }

    @Override
    public void greet() {
        System.out.println("Assalamualaikum");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.fun();
        m.greet();

        B.play();
    }

}
