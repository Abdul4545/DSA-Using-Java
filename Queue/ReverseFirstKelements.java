package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelements {

    public static Queue<Integer> reverseElements(Queue<Integer> q, int k) {
        
        Stack<Integer> st = new Stack<>();
        int n = q.size();

        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        while (st.size() > 0) {
            q.add(st.pop());
        }

        for (int i = 0; i < n - k; i++) {
            int x = q.remove();
            q.add(x);
        }

        return q;

    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);

        reverseElements(q, 3);
        System.out.println(q);

    }

}
