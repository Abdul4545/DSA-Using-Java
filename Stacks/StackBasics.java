package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class StackBasics {
    
    public static void main(String[] args) {

        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(3);
        st.push(34);

        System.out.println(st);
        System.out.println("printed stack");
        System.out.println("stack peek" + st.peek());
        System.out.println("Size of stack is : "+ st.size());


        // copy contents of one stack to another in same order

        Scanner sc = new Scanner(System.in);
        Stack <Integer> st1 = new Stack<>();

        int n;
        System.out.println("Enter number of elements you want to insert : ");
        n = sc.nextInt();

        System.out.println("Enter the elements : ");
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st1.push(x);
        }

        System.out.println(st1);

        Stack<Integer> middleReverse = new Stack<>();

        while (st1.isEmpty() == false) {
            middleReverse.push(st1.pop());
            
        }

        Stack <Integer> copyStack = new Stack<>();
        System.out.println(middleReverse);
        while (middleReverse.isEmpty() == false) {
            copyStack.push(middleReverse.pop());
        }

        System.out.println(copyStack);

        sc.close();

    }
}
