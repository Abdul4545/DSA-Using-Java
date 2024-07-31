package Stacks;

import java.util.Stack;

public class PostfixToPrefix {

    public static void main(String[] args) {

        String postfix = "953+4*4/-";

        Stack <String> val = new Stack<>();

        for(int i = 0; i < postfix.length(); i++) {

            char ch = postfix.charAt(i);

            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57) {
                val.push(ch+"");
            }

            else {
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;

                val.push(op+v2+v1);
            }
        }

        System.out.println(val.pop());
        
    }  
}

// 3+4-6/5
// -+34/65

