package Strings;

import java.util.Scanner;

public class StringAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "abc";


        // String addition to string
        // s1 = s1 + "def";


        // character addition to string
        // s1 = s1 + 'd';


        // number addition to string
        // s1 = s1 + 10; 
    
        // -> 10 is converted to string 1st then added to s1

        // s1 = s1 + 10 + 20; // -> left to right operation is performed -> abc1020


        System.out.println(s1 + 10 + 20);
        sc.close();

    }
}
