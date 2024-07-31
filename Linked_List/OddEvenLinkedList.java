package Linked_List;

public class OddEvenLinkedList {

    static Node oddEvenNode(Node head) {

        Node temp = head;
        Node Even = new Node(0);
        Node tempEven = Even;

        Node Odd = new Node(0);
        Node tempOdd = Odd;

        while(temp != null) {
            tempOdd.nextNode = temp;
            temp = temp.nextNode;
            tempOdd = tempOdd.nextNode;

            tempEven.nextNode = temp;
            temp = temp.nextNode;
            tempEven = tempEven.nextNode;
        }

        Odd = Odd.nextNode;
        Even = Even.nextNode;
        tempOdd.nextNode = Even;

        return Odd;
    }

    static void display(Node head) {
        
        if(head == null) {
            return;
        }

        System.out.print(head.data + " ");
        display(head.nextNode);
    }


    public static void main(String[] args) {
        

        Node a = new Node(1);
        Node b = new Node(12);
        Node c = new Node(13);
        Node d = new Node(12);
        Node e = new Node(1);
        Node f = new Node(0);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;

        Node m = oddEvenNode(a);

        display(m);

    }
}
