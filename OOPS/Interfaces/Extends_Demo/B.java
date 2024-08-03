package OOPS.Interfaces.Extends_Demo;

public interface B extends A {

    void greet();

    // static interface methods should always have body in interface and will be called via interface name
    static void play() {
        System.out.println("Lets play a game");
    }
}
