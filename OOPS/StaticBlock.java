package OOPS;

public class StaticBlock {

    static int a = 4;
    static int b;

    // will only run once, when the class is loaded
    static {
        System.out.println("I am in Static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b);

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        b += 3;

        System.out.println(a + " " + b);



    }
    
}
