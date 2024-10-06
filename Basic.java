// import java.util.Scanner;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        // output
        // System.out.print("Hello Wolrd\n");
        // System.out.println("Hello Abdul Moid Khan");

        // variables

        // byte -> Stores whole numbers from -128 to 127 (1 byte)
        // byte b = 127; 
        // System.out.println(b);

        // short -> Stores whole numbers from -32,768 to 32,767
        // short Short = -32768;
        // System.out.println(Short);

        // int -> Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int Integer = 2147483647;
        System.out.println(Integer);


        // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long LongInt = 123456123456L;
        System.out.println(LongInt);

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        String input2 = sc.next();
        System.out.println(input1 + input2);
        sc.close();


    }
}
