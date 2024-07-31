package OOPS.Interfaces.Extends_Demo;

public interface B extends A {
    void greet();


    // static interface methods should always have a body
    static void play() {
        System.out.println("Lets play a game");
    }
}
