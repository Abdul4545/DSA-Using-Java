package Strings;

import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        // ASCII Value
        // A => 65, a => 97, 0 => 48

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your word here : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);

        // toggle characters
        for(int i = 0; i < sb.length(); i++) {
           // p -> P
           // check -> alphabet small or capital
           boolean flag = true;  // true -> capital
           char ch = sb.charAt(i);
           
           if(ch == ' ') {
            continue;
           }

           int ascii = (int) ch;

           if(ascii >= 97) {
                flag = false;
           }

           if (flag == true) {
                ascii += 32;
                char convertedCh = (char) ascii;
                sb.setCharAt(i, convertedCh); 
           }

           else {
            ascii -= 32;
            char convertedCh = (char) ascii;
            sb.setCharAt(i, convertedCh);
           }

        }

        System.out.println(sb);

        sc.close();
        
    }
    
}
