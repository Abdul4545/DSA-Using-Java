package OOPS.Interfaces.Nested_Interfaces;

public class A {

    // nested interface
    // nested interface can be public , protected or protected
    // but the top level interface has to be declared as public or default
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

