package OOPS;

public class MainClass {

    public static void main(String[] args) {

        HumanClass moid = new HumanClass(20, "Abdul Moid", "Male", false);
        // System.out.println(moid.population);

        HumanClass rameshwar = new HumanClass(20, "Rameshwar Tripathi", "Male", false);

        HumanClass asaad = new HumanClass(6, "Asaad Khan", "Male", false);


        // while accessing the static variable or method access it using class name not by object name of the class
        // static variables do not depend on the object we can access them without creating any object 

        // that is why main function is always static 
        // System.out.println(moid.population);

        System.out.println(HumanClass.population);

        // HumanClass.message();


        // a static method can only access static data and methods
        
        
    }

    static void fun() {
        // greeting();
        // we can not use this because it requires an instance, or we make it static

        // by using object we can access the non static method
        MainClass obj = new MainClass();
        obj.greeting();
    }

    // something that is not static , belongs to an object
     void greeting() {
        System.out.println("Hello World!");
        System.out.println(data);
    }

    int data = 10;
    
}
