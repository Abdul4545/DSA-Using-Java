package Stacks;

import java.util.Stack;

public class InfixToPrefix {

    static String infixToPrefix(String infix) {

        Stack<String> val = new Stack<>();
        Stack<Character> symbol = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            // '0' -> 48 and '9' -> 57

            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);
            }

            else if (symbol.size() == 0 || ch == '(' || symbol.peek() == '(') {
                symbol.push(ch);
            }

            else if (ch == ')') {
                while (symbol.peek() != '(') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = symbol.pop();

                    String t = o + v1 + v2;
                    val.push(t);
                }

                symbol.pop();
            }

            else {
                if (ch == '+' || ch == '-') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = symbol.pop();

                    String t = o + v1 + v2;
                    val.push(t);

                    // push symbol
                    symbol.push(ch);

                }

                if (ch == '*' || ch == '/') {
                    if (symbol.peek() == '*' || symbol.peek() == '/') {
                        // work

                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = symbol.pop();

                        String t = o + v1 + v2;
                        val.push(t);

                        // push
                        symbol.push(ch);
                    }

                    else {
                        symbol.push(ch);
                    }
                }
            }
        }

        // val stack size -> 1

        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = symbol.pop();

            String t = o + v1 + v2;
            val.push(t);
        }

        return val.peek();
    }

    public static void main(String[] args) {

        String str = "9-(5+3)*4/4";

        System.out.println(infixToPrefix(str));
        
    }

}
