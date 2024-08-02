package OOPS.Abstract_Demo;

public class Son extends Parent {

    // every child classs needs to override all the abstract class of the parent class

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name); 
    }

    void partner(String name, int age) {
        System.out.println("I love " + name + "and she is "+ age + " years old.");

    }

    public Son(int age) {
        super(age);
    }
    
}
