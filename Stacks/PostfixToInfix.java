package Stacks;

import java.util.Stack;

public class PostfixToInfix {

    public static void main(String[] args) {

        String postFix = "953+4*4/-";

        Stack <String> val = new Stack<>();
        
        for(int i = 0; i < postFix.length(); i++) {

            char ch = postFix.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57) {
                val.push(ch+"");
            }

            else {
                String val1 = val.pop();
                String val2 = val.pop();
                char op = ch;
                val.push('('+val2+op+val1+')'); 
            }
        }

        System.out.println(val.pop());
        
    }
    
}
