package OOPS.Access_Control;

public class A {

    private int num; 
    // access only in this file

    String name; 
    // when we dont specify any access modifier then by default it is allowed to access in the same package, as well as in subclass of same same package

    int[] arr;

    protected String address;
    // can be accessed in the same package, in the subclass of the same package, in the subclass of different package


    //getter
    public int getNum() {
        return num;
    }

    // setter
    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
       this.arr = new int[num];
    }

    
}