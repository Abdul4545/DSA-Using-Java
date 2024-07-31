package OOPS.Inheritance;

public class Main {

    public static void main(String[] args) {

        // Base_Class BS1 = new Base_Class(5);

        // System.out.println(BS1.length + " " + BS1.height + " " + BS1.width);

        // Base_Class BS2 = new Base_Class(BS1);

        // System.out.println(BS2.length + " " + BS2.height + " " + BS2.width);

        // Box_Weight box = new Box_Weight(1,3,4,6);

        // System.out.println(box.length + " " + box.weight);

        // System.out.println(box.height + " " + box.weight);



        // Base_Class BS3 -> Refernce variable
        // new Box_Weight -> object types

        // it is actually the type of refernce variable that actually determines what objects can be accessed

        // here we can access only those things which are part of base class and are not private
        // Base_Class BS3 = new Box_Weight(5,4,3,2);

        // System.out.println(BS3.width);

        // System.out.println(BS3.weight); // it can not be accessed


        // here we are trying to refernce a child class to a parent class which is not possible

        // there are many variables in both parent and child classes

        // we are given access to variables that are in the ref type i.e, Box_Weight, hence we should have access to Weight_Box variables

        // this also means, that when when we are trying to access should be initialized, but when the object itself is of type parent class, how we can call the constructor of the child class
        // this is why error is there

        // it will show error
        // Box_Weight BS3 = new Base_Class(5,4,3);

        // Box_Weight BS4 = new Box_Weight(224);
        // System.out.println(BS4.weight);

        // Box_Weight BS5 = new Box_Weight();

        // System.out.println(BS5.height);


        // multilavel inheritance
        Box_Price BS6 = new Box_Price();
        System.out.println(BS6.width);




        // multiple inheritance is not supported by java
        // as it can cause ambiguity

        // instead of multiple inheritance java supprts interface



        // hybrid inheritance is also not supported by java 
    
        // hybrid inheritance -> combination of single and multiple inheritance


    }
    
}

