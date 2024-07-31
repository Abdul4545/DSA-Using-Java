package Stacks;

import java.util.Stack;

public class DisplayStack {

    static void displayRecursively(Stack <Integer> st) {
        if(st.size() == 0) {
            return;
        }
        int top = st.pop();
        displayRecursively(st);
        System.out.print(top + " ");
        st.push(top);

    }
    
    public static void main(String[] args) {
        
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(3);
        st.push(34);

        // display using array

        // int n = st.size();
        // int[] arr = new int[n];

        // for(int i = n-1; i >= 0; i--) {
        //     arr[i] = st.pop();
        // }

        // for(int i = 0; i < n; i++) {
        //     int x = arr[i];
        //     System.out.print(x + " ");
        //     st.push(x);
        // }
        

        displayRecursively(st);

    }
}
