package Linked_List;

public class CycleDetection {

    public static boolean detectCycle(Node head) {
        //Your code goes here

        if(head == null || head.nextNode == null) {
            return false;
        }
        
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;

            if(fast == slow) {
                return true;
            }
        }

        return false;
    }


    // length of cycle
    public static int lengthCycle(Node head) {
        
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;

            if(fast == slow) {
                // calculate the length
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.nextNode;
                    length++;
                }
                while(temp != fast);
                return length;
            }
        }
        return 0;
    }


    public static Node firstNode(Node head) {
        // Write your code here.
        Node slow = head;
        Node fast = head;

        if(slow.nextNode == null) return null;

        while(fast != null && fast.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;

            if(slow == fast) {
                 break;
            }
        }

        Node temp = head;
        while(temp != slow) {
            slow = slow.nextNode;
            temp = temp.nextNode;

            if(temp == slow) {
                return temp;
            }
        }

        return null;
    }


    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;
        f.nextNode = g;
        g.nextNode = c;

        // System.out.println(detectCycle(c));

        Node m = firstNode(a);
        System.out.println(m.data);

        
    }
}


class Node {
    int data;
    Node nextNode;

    Node(int data) {
        this.data = data;
        this.nextNode = null; 
    }
}


