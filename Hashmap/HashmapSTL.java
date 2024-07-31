package Hashmap;

import java.util.*;

public class HashmapSTL {

    static void HashMapMethods() {

        // syntax
        Map<String, Integer> mp = new HashMap<>();
        // here Map is an interface and HashMap is a class

        // adding elements
        mp.put("Akash", 20);
        mp.put("Vivek", 22);
        mp.put("Depak", 24);
        mp.put("Sohan", 21);
        mp.put("kukkar", 23);


        System.out.println();
        // getting value of a key from the hashmap
        System.out.println("get method value : " + mp.get("Vivek"));


        // Changing/updating the value of a key
        mp.put("kukkar", 43);
        System.out.println(mp.get("kukkar"));

        // put is used for insertion and updation

        // inserts if key does not exists
        // updates if the key already exists


        // removing a pair from the Hashmap
        System.out.println("remove method value : " + mp.remove("kukkar"));
        // returns value if key exists
        // null if key does not exists 

        // checking if a key is in the HashMap
        System.out.println("contains method value : " + mp.containsKey("MOID"));
        System.out.println(mp.containsKey("kukkar"));

        // adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Vivek", 22);

        // get all the keys in the Hashmap
        System.out.println(mp.keySet());

        System.out.println(mp.values());

        System.out.println(mp.entrySet()); // returns set

        System.out.println(mp);

        // Traversing all the entries of Hashmap - multiple methods

        // for(String key: mp.keySet()) {
        //     System.out.println("Age of " + key + " is "+ mp.get(key));
        // }

        // for (Map.Entry<String, Integer> e  : mp.entrySet()) {
        //     System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        // }

        for(var e: mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

    }


    public static void main(String[] args) {
        HashMapMethods(); 
    }

}
