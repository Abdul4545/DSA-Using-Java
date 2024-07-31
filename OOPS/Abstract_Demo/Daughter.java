package OOPS.Abstract_Demo;

public class Daughter extends Parent { 

    // every child classs needs to override all the abstract class of the parent class

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name); 
    }

    void partner(String name, int age) {
        System.out.println("I love " + name + "and he is "+ age + " old.");

    }

    public Daughter(int age) {
        super(age);
    }
    
}
