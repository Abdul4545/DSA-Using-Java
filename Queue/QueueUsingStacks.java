package Queue;

import java.util.Stack;
public class QueueUsingStacks {

    public static void main(String[] args) {


        QueueUsingStack q = new QueueUsingStack();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        System.out.println(q.st);

        q.deQueue();

        System.out.println(q.isEmpty());
        System.out.println(q.peek());
          
    }
    
}

class QueueUsingStack {
        
    Stack <Integer> st = new Stack<>();
    Stack <Integer> helper = new Stack<>();

    void enQueue(int val) {
        st.push(val);
        
    }

    int deQueue() {
        if(st.size() == 0) {
            return -1;
        }

        else {
            while(st.size() > 1) {
                helper.push(st.pop());
            }
            int x = st.pop();

            while(helper.size() > 0) {
                st.push(helper.pop());
            }
            return x;
        }
    }

    int peek() {
        
        if(st.size() == 0) {
            return -1;
        }

        else if(st.size() == 1) {
            return st.peek();
        }

        else {
            while(st.size() > 1) {
                helper.push(st.pop());
            }
            int x = st.peek();

            while(helper.size() > 0) {
                st.push(helper.pop());
            }
            return x;
        }

    }

    boolean isEmpty() {
        if(st.isEmpty()) {
            return true;
        }

        return false;
    }
}