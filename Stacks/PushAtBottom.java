package Stacks;

import java.util.Stack;

public class PushAtBottom {
    
    public static void pushAtBottom(Stack <Integer> st, int val) {
        if(st.size() == 0) {
            st.push(val);
            return;
        }

        int top = st.pop();
        pushAtBottom(st, val);
        st.push(top);
    }

    public static void main(String[] args) {

        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(3);
        st.push(34);

        pushAtBottom(st, 50);
        System.out.println(st);
        
    }
}
