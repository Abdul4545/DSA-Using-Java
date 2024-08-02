package OOPS.Abstract_Demo;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(26);

        son.career("Doctor");

        Daughter daughter = new Daughter(23);

        daughter.career("Teacher");




        // Parent father = new Parent();
        // we can not create objects of an abstract class


        Parent.hello();
        son.normal();
    
    }
    
}
