package Linked_List;

public class ReverseList {

    static class Node {
        int val;
        Node nextNode;

        Node(int val) {
            this.val = val;
        }

    }

    public static Node reverseList(Node head) {

        if(head == null || head.nextNode == null) {
        return head;
        }

        // Node newHead = reverseList(head.nextNode);
        // head.nextNode.nextNode = head;
        // head.nextNode = null;
        // return newHead;


        Node current = head;
        Node previous = null;
        Node Next = head.nextNode;

        while (current != null) {
            Next = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = Next;
        }

        head = previous;
        return head;
    }



    // static void reverse(Node head) {
    //     if(head == tail) {
    //         head = tail;
    //         return;
    //     }

    //     reverse(head.nextNode);
    //     tail.nextNode = head;
    //     tail = head;
    //     tail.nextNode = null;

    // }




    public static Node reverseListPart(Node head, int left, int right) {

        if(left == right) {
            return head;
        }

       // skip the first left-1 nodes 
       Node current = head;
       Node prev = null;
       for(int i = 0; current != null && i < left-1; i++) {
            prev = current;
            current = current.nextNode;
       }

       Node last = prev;
       Node newEnd = current;

       // reverse between left and right
       Node next = current.nextNode;
       for(int i = 0; current != null && i < right - left + 1; i++) {
            current.nextNode = prev;
            prev = current;
            current = next;
            if(next != null) {
                next = next.nextNode;
            }
       }

       if(last != null) {
        last.nextNode = prev;
       }

       else {
        head = prev;
       }

       newEnd.nextNode = current;
       return head;

    }

    static void display(Node head) {

        if (head == null) {
            return;
        }

        System.out.print(head.val + " ");
        display(head.nextNode);
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

        // Node r = reverseList(a);

        Node r = reverseListPart(a, 2, 4);
        display(r);

    }
}
