package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterLeaveQueue {


    public static void interLeaveQueue(Queue < Integer > q) {
        

        // queue = [1,2,3,4,5, 6,7,8,9,10]
        // take 1st half of queue and 2nd half of queue
        // place 1 item from 1st half and 1 item from 2nd half in the queue
        // [1,6,2,7,3,8,4,9,5,10]


        // using array
        // int arr[] = new int[q.size()];

        // for(int i = 0; i < arr.length; i = i+2) {
        //     arr[i] = q.remove();
        // }

        // for(int i = 1; i < arr.length; i = i+2) {
        //     arr[i] = q.remove();
        // }

        // for(int i = 0; i < arr.length; i++) {
        //     q.add(arr[i]);
        // }



        // using stack

        Stack<Integer> st = new Stack<>();
        int size = q.size();

        // move 1st half of the queue into the stack
        while(q.size() > size/2) {
            st.push(q.remove());
        }

        // move the stack elements back into the queue
        while(st.size() > 0) {
            q.add(st.pop());
        }

        // move 1st(2nd) half of the queue into the stack
        while(q.size() > size/2) {
            st.push(q.remove());
        }

        // one by one add st.peek() and q.peek() into the queue

        while(st.size() > 0) {
            q.add(st.pop());
            q.add(q.remove());    
        }

        // reverse the queue using the stack
        while(q.size() > 0) {
            st.push(q.remove());
        }

        while(st.size() > 0) {
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        // [1,2,3,4,5, 6,7,8,9,10]
        // take 1st half of queue and 2nd half of queue
        // place 1 item from 1st half and 1 item from 2nd half in the queue
        // [1,6,2,7,3,8,4,9,5,10]

        System.out.println(q);
        
        interLeaveQueue(q);

        System.out.println(q);
        
    }
    
}
