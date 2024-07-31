package Linked_List;

public class DoublyLL {

    static class Node {
        int data;
        Node nextNode;
        Node prevNode;  
        Node(int data) {
            this.data = data;
        }
    }

    public static Node insertAtHead(Node head, int val) {
        Node temp = new Node(val);

        temp.nextNode = head;
        head.prevNode = temp;
        head = temp;

        return head;
    }

    static void insertAtTail(Node any, int val) {
        Node temp = any;
        Node tail = new Node(val);
        if(temp.nextNode != null)  {
            while (temp.nextNode != null) { 
                temp = temp.nextNode;
            }

            temp.nextNode = tail;
            tail.prevNode = temp;
            tail.nextNode = null;
        }
            
        temp.nextNode = tail;
        tail.prevNode = temp;
        tail.nextNode = null;
    }

    static void insertAtIndex(Node head, int index, int value) {

       Node s = head;
       
       for(int i = 1; i < index; i++) {
            s = s.nextNode;
       }

       Node r = s.nextNode;
       Node t = new Node(value);

       s.nextNode = t;
       t.prevNode = s;

       t.nextNode = r;
       r.prevNode = t;

    }


    static void display(Node head) { 
        if(head == null) {
            return;
        }
        System.out.print(head.data + " ");
        display(head.nextNode);
    }

    static void printList2(Node any) {
        Node temp = any;
        if(temp.prevNode != null) {
            while (temp.prevNode != null) {
                temp = temp.prevNode;
            }
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.nextNode;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(12);
        Node e = new Node(20);


        a.prevNode = null;
        a.nextNode = b;

        b.nextNode = c;
        b.prevNode = a;

        c.nextNode = d;
        c.prevNode = b;

        d.nextNode = e;
        d.prevNode = c;

        e.prevNode = d;

        display(a);

        // System.out.println();

        // printList2(c);

        // System.out.println();

        // Node newHead = insertAtHead(a, 30);

        // display(newHead);
        // System.out.println();

        // insertAtTail(e, 45);

        // display(newHead);

        insertAtIndex(a, 2, 90);
        System.out.println();
        display(a);
 
    }
    
}
