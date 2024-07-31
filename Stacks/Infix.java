package Stacks;

import java.util.Stack;

public class Infix {

    public static void main(String[] args) {

        // int x = 9-(5+3)*4/6;
        // System.out.println(x);

        String str = "9-(5+3)*4/4";

        Stack<Integer> val = new Stack<>();
        Stack<Character> symbol = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            // '0' -> 48 and '9' -> 57

            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            }

            else if (symbol.size() == 0 || ch == '(' || symbol.peek() == '(') {
                symbol.push(ch);
            }

            else if(ch == ')') {
                while (symbol.peek() != '(') {
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (symbol.peek() == '+') {
                        val.push(v1 + v2);
                    }

                    if (symbol.peek() == '-') {
                        val.push(v1 - v2);
                    }

                    if (symbol.peek() == '*') {
                        val.push(v1 * v2);
                    }

                    if (symbol.peek() == '/') {
                        val.push(v1 / v2);
                    }

                    symbol.pop();
                }
                symbol.pop();
            }

            else {
                if (ch == '+' || ch == '-') {
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (symbol.peek() == '+') {
                        val.push(v1 + v2);
                    }

                    if (symbol.peek() == '-') {
                        val.push(v1 - v2);
                    }

                    if (symbol.peek() == '*') {
                        val.push(v1 * v2);
                    }

                    if (symbol.peek() == '/') {
                        val.push(v1 / v2);
                    }

                    symbol.pop();

                    // push symbol
                    symbol.push(ch);

                }

                if (ch == '*' || ch == '/') {
                    if (symbol.peek() == '*' || symbol.peek() == '/') {
                        // work

                        int v2 = val.pop();
                        int v1 = val.pop();

                        if (symbol.peek() == '+') {
                            val.push(v1 + v2);
                        }

                        if (symbol.peek() == '-') {
                            val.push(v1 - v2);
                        }

                        if (symbol.peek() == '*') {
                            val.push(v1 * v2);
                        }

                        if (symbol.peek() == '/') {
                            val.push(v1 / v2);
                        }

                        symbol.pop();

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
            int v2 = val.pop();
            int v1 = val.pop();

            if (symbol.peek() == '+') {
                val.push(v1 + v2);
            }

            if (symbol.peek() == '-') {
                val.push(v1 - v2);
            }

            if (symbol.peek() == '*') {
                val.push(v1 * v2);
            }

            if (symbol.peek() == '/') {
                val.push(v1 / v2);
            }

            symbol.pop();
        }

        System.out.println(val.peek());

    }

}