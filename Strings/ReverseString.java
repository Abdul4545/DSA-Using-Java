package Strings;

import java.util.*;
public class ReverseString {

    public static String reverseStr(String str) {
        Stack<String> stack = new Stack<>();
        
        String words[] = str.split(" ");
        
        for(String word : words) {
            stack.push(word);
        }
        
        StringBuilder reversed = new StringBuilder();
        
        while(!stack.isEmpty()) {
            reversed.append(stack.pop());
            
            if(!stack.isEmpty()) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
    
    public static void main(String args[]) {
    
        String str = "I am neo";
        System.out.println(reverseStr(str));

    }
}

