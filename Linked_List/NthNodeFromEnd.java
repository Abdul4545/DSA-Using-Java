package Linked_List;

public class NthNodeFromEnd {

    // find nth node from the end
    // static Node nthNode(Node head, int n) {
    //     int size = 0;
    //     Node temp = head;
    //     while(temp != null) {
    //         size++;
    //         temp = temp.nextNode;
    //     }

    //     int m = size - n + 1; 
    //     // mth node from start

    //     temp = head;
    //     for(int i = 1; i < m; i++) {
    //         temp = temp.nextNode;
    //     }

    //     return temp;
    // }

    // 2nd method

    static Node nthNode(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for(int i = 0; i < n; i++) {
            fast = fast.nextNode;
        }

        while(fast != null) {
            slow = slow.nextNode;
            fast = fast.nextNode;
        }

        return slow;
    }

    // deleting nth node from the end of the linked list
    public static Node DeleteNthNodeFromLast(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for(int i = 0; i < n; i++) {
            fast = fast.nextNode;
        }

        // for deleting the 1st element from start of the list 
        if(fast == null) {
            head = head.nextNode;
            return head;
        }

        while(fast.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode;
        }

        slow.nextNode = slow.nextNode.nextNode;
        return head;

    }


    static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.nextNode;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(12);
        Node c = new Node(14);
        Node d = new Node(24);
        Node e = new Node(40);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        // 4 12 14 24 40

        // int n = 5;
        // Node q = nthNode(a, n);
        // System.out.println(n+"th node from end : " + q.data);

        // a = DeleteNthNodeFromLast(a, 3);
        // display(a);
        
        display(a);

        a = DeleteNthNodeFromLast(a, 5);
        display(a);

    }
    
}

class Node{
    int data;
    Node nextNode;
    Node(int data) {
        this.data = data;
    }
}
