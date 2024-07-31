package Strings;

import java.util.*;


public class StringBasics {
    public static void main(String[] args) {

        // String name = "               Abdul Moid";
        // System.out.println(name);

        Scanner sc = new Scanner(System.in);

        // taking input form user with white Space 
        // String name  = sc.nextLine();

        // taking input from user without white Space
        // String name1 = sc.next();

        // System.out.println(name);
        // System.out.println(name1);


        // basic function -> charAt(), length()
        // System.out.println(name.charAt(name.length() - 4));
        // System.out.println(name.length());
        
        // System.out.println(name.stripLeading());

        // String name1 = "Asaad";
        // System.out.println(name1.indexOf('a'));

        // compareTo() -> returns integer value based on lexographically -> integer value can be 0, +ve as well -ve
        // characters ASCII value is compared

        // String name2 = "Asaad";
        // String name3 = "Abdul Moid";
        // System.out.println(name1.compareTo(name2));

        // System.out.println(name2.compareTo(name3));
        // System.out.println(name2.contains("aa"));

        // System.out.println(name1.startsWith("Asa"));
        // System.out.println(name1.endsWith("aad"));



        // Immutibility of String

        String str1 = "Hello";
        System.out.println(str1);

        // str1.charAt(0) = 'a';   // -> will give error

        // str1 = str1.substring(0, 2) + 'y' + str1.substring(3);
        // System.out.println(str1);


        // .equals and == 
        // ==  -> checks the address
        // .equals -> checks address if address is same in returns true else compares the value character by character and returns the boolean value
        String str2 = "Hello";
        String str3 = new String("Hello");

        // System.out.println(str1 == str2);
        // System.out.println(str1.equals(str2));

        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));









        sc.close();

    }
}
