package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    public static void main(String[] args) {

        Stacks s = new Stacks();
        s.push(10);
        s.push(12);
        s.push(15);
        s.push(20);
        System.out.println(s.q);
        s.pop();
        System.out.println(s.isEmpty());
        System.out.println(s.getSize());

        
        
    }
    
}


class Stacks {

    Queue <Integer> q = new LinkedList<>();

    public int getSize() {
        int x = q.size();
        return x;
    }


    public boolean isEmpty() {
        return q.isEmpty();
    }

    public void push(int element) {
        q.add(element);
        for(int i = 0; i < q.size()-1; i++) {
            q.add(q.remove());
        }

    }

    public int pop() {
        if(q.isEmpty()) {
            return -1;
        }

        else {
            return q.remove();
        }
    }

    public int top() {
        if(q.size() == 0) {
            return -1;
        }

        else {
            return q.peek();
        }  
    }
}
