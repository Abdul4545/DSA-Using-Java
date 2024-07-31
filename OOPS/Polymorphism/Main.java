package OOPS.Polymorphism;

public class Main {

    public static void main(String[] args) {
        
        // Shapes shape = new Shapes();
        // Circle circle = new Circle();
        // Triangle triangle = new Triangle();
        // Rectangle rectangle = new Rectangle();

        // triangle.area();


        Shapes shape1 = new Shapes();
        Shapes circle1 = new Circle();
        Shapes triangle1 = new Triangle();
        

        circle1.area();

        Rectangle.greetings();

        // Parent obj = new Child();
        // here, which method will be called depends on this type of Child, this is known as Upcasting.

         

        // types of polymorphism

        // 1) Compile time / static polymorphism 
        // achieved via method overloading
        // example : multiple constructors with different parameters


        // 2) runtime / Dynamic Polymorphism 
        // achieved via method overriding
        // example : when the child class has a method as its parent class then it is called method overriding, only the body content is different.


        // static methods can be inherited but can not be overriden

        // overriding depends on object
        // static does not depend on oject hence static methods can not be overriden -> we can inherit but we can not override


    }
    
}
