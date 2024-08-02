package OOPS.Single_Object;

// class which has only one object
public class SingletonClass {

    String name;
    int age = 22;
    private SingletonClass(String name) {
        this.name = name;
    }

    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        // check whether 1 obj is created or not
        if(instance == null) {
            instance = new SingletonClass("Moid");
        }

        return instance;
    }


    
}
