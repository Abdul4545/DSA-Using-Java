package OOPS.Polymorphism;

public class Circle extends Shapes {
    
    

    // this will run when obj of Circle is created
    // hence it is overriding the parent class

    // @Override // this is called annotation
    // it checks whether something which we are overriding is being overriden or not

    @Override
    void area() {
        System.out.println("Area of circle is pi * r * r.");
    }

    void areaaa() {
        System.out.println("Area of circle is pi * r * r.");
    }
}
