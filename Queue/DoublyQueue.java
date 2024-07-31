package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DoublyQueue {


    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<>();

        // 6 Operations - add, remove/poll, peek/element

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addFirst(4);

        System.out.println(dq);

        dq.removeLast();
        dq.removeFirst();

        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    
    }
    
}
