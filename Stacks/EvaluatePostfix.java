package Stacks;

import java.util.Stack;

public class EvaluatePostfix {

    public static void main(String[] args) {

        String str = "953+4*4/-";

        Stack<Integer> val = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            }

            else {
                int val2 = val.pop();
                int val1 = val.pop();

                if(ch == '+') {
                    val.push(val1 + val2);
                }

                if(ch == '-') {
                    val.push(val1 - val2);
                }

                if(ch == '*') {
                    val.push(val1 * val2);
                }

                if(ch == '/') {
                    val.push(val1 / val2);
                }
            }
        }

        System.out.println(val.peek());
        
    }
    
}
