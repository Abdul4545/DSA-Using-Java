package OOPS.Cloning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Human moid = new Human(20, "Abdul Moid");

        // Human twin = new Human(moid);
        // copy of moid

        Human twin = (Human)moid.clone();

        System.out.println(twin.age + " " + twin.name);

        twin.name = "asaad";
        System.out.println(moid.name + " " + twin.name);


        System.out.println(Arrays.toString(twin.arr));

        twin.arr[2] = 100;
        
        System.out.println(Arrays.toString(moid.arr));

    }

}
