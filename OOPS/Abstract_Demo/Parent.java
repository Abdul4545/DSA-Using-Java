package OOPS.Abstract_Demo;

// if a class is containing one or more abstract methods then the class should also be abstract
public abstract class Parent {

    // abstract method
    abstract void career(String name);

    abstract void partner(String name, int age);

    int age;

    // abstract class constructor
    public Parent() {

    }

    public Parent(int age) {
        this.age = age;
    }

    // abstract constructor is not allowed
    // abstract Parent(int age) {
    // this.age = age;
    // }

    // only public, protected & private are permitted

    static void hello() {
        System.out.println("hi from static method in parent");
    }

    // can be overriden by child class
    void normal() {
        System.out.println("hii from Normal method in parent");
    }

}
