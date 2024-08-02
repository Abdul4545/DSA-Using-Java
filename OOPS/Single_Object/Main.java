package OOPS.Single_Object;

public class Main {
    public static void main(String[] args) {
        
        SingletonClass obj1 = SingletonClass.getInstance();
        System.out.println(obj1.name + " " + obj1.age);
        SingletonClass obj2 = SingletonClass.getInstance();
        System.out.println(obj2.name + " " + obj2.age);
        SingletonClass obj3 = SingletonClass.getInstance();
        obj3.age = 23;
        System.out.println(obj1.name +" " + obj1.age);

        // all 3 ref variables are pointing to just on object
    }
    
}
