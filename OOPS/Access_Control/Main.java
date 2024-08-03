package OOPS.Access_Control;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // A obj = new A(23, "Abdul Moid");

        // obj.getNum();

        // String n = obj.name;
        // System.out.println(n);


        try {
            
            File file = new File("E:\\DSA using Java\\Notes1.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                System.out.println(s);
            }

            sc.close();
        } 
        
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        
    }
}
