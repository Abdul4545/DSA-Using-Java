package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class DisplayQueue {

    public static void main(String[] args) {
        
        Queue <Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // print all the elements in the queue using add(), remove(), peek(), size() and extra queue


        Queue<Integer> aux = new ArrayDeque<>();
        
        while (q.size() > 0) {
            int removed = q.poll();
            System.out.print(removed + " ");
            aux.add(removed);
        }

        System.out.println();

        while (aux.size() > 0) {
            int removed = aux.poll();
            q.add(removed);
        }
        
        System.out.println(q);
        
    }
    
}
