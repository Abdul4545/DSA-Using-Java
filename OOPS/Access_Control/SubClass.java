package OOPS.Access_Control;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(23, "Asaad Khan");

        String add = obj.address;
        add = "Naugarh";
        System.out.println(add);

    }


}
