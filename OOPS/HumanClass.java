package OOPS;

public class HumanClass {
    int age;
    String name;
    String gender;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello World from message");
        // System.out.println(this.age); // can not use this over here as static function not dependent on object
    }

    public HumanClass(int age, String name, String gender, boolean married) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.married = married;
        HumanClass.population += 1;
        HumanClass.message();
    }
 
}
