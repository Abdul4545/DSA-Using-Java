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

        // if(head == null || head.nextNode == null) {
        //     return head;
        // }

        // Node newHead = reverseList(head.nextNode);
        // head.nextNode.nextNode = head;
        // head.nextNode = null;
        // return newHead;


        Node current = head;
		Node previous = null;
		Node Next = null;

		while(current != null) {
			Next = current.nextNode;
			current.nextNode = previous;
			previous = current;
			current = Next;
		}

		return previous;
    }



    static void display(Node head) {
        
        if(head == null) {
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

        Node r = reverseList(a);

        display(r);
        
    }
    
}
