package OOPS.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        System.out.println(list);




        // only one thread can access a vector at once whereas list ArrayList can be accessed by multiple thread at a time

        // vector is slow whereas ArrayList is fast
        List<Integer> vector = new Vector<>();

        vector.add(23);
        vector.add(34);
        vector.add(45);

        System.out.println(vector);

        



    }

}
