

public class Shadowing {
    static int a  = 90; // this will be shadowed at line 10

    public static void main(String[] args) {
        
        System.out.println(a);

        int a; // the class variable at line 4 is shadowed by this

        // System.out.println(a);
        //scope will begin when value is initialised

        a = 40;
        System.out.println(a);

        fun();
    }

    private static void fun() {
        System.out.println(a);
    }
    
}