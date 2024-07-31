package OOPS.Single_Object;

import OOPS.Access_Control.A;

public class SubClass extends A {


    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(23, "Asaad Khan");

        String add = obj.address;
    }
}
