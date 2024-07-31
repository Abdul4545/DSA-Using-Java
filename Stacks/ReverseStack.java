package Stacks;

import java.util.Stack;

public class ReverseStack {

    public static void reverse(Stack <Integer> st) {
        if(st.size() == 1) {
            return;
        }

        int top = st.pop();

        reverse(st);

        PushAtBottom.pushAtBottom(st, top);

    }
    
    public static void main(String[] args) {

        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(3);
        st.push(34);

        System.out.println(st);
        reverse(st);
        System.out.println(st);
        
    }
}
