package Linked_List;

public class ListIntersection {

    public static void display(Node head) {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.nextNode;
        }

        System.out.println();

    }

    public static Node getIntersectionNode(Node headA, Node headB) {

        Node tempA = headA;
        Node tempB = headB;

        int lengA = 0;
        while(tempA != null) {
            lengA++;
            tempA = tempA.nextNode;
        }

        int lengB = 0;
        while(tempB != null) {
            lengB++;
            tempB = tempB.nextNode;
        }
        
        tempA = headA;
        tempB = headB;

        if(lengA > lengB) {
            int steps = lengA - lengB;
            for(int i = 0; i < steps; i++) {
                tempA = tempA.nextNode;
            } 
        }

        else {
            int steps = lengB - lengA;
            for(int i = 0; i < steps; i++) {
                tempB = tempB.nextNode;
            }
        }

        while(tempA != tempB) {
            tempA = tempA.nextNode;
            tempB = tempB.nextNode;
        }
        return tempA;   
    }

    public static void main(String[] args) {

        Node a = new Node(12);
        Node b = new Node(34);
        Node c = new Node(22);
        Node d = new Node(32);
        Node e = new Node(45);
        Node f = new Node(60);


        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;


        Node l = new Node(10);
        Node m = new Node(42);
        Node n = new Node(29);
        Node o = new Node(32);

        l.nextNode = m;
        m.nextNode = n;
        n.nextNode = o;
        o.nextNode = b;

        display(l);

        Node intersectionNode = getIntersectionNode(a, l);
        System.out.println(intersectionNode.data);

    
    }
}


class Node{
    int data;
    Node nextNode;
    Node(int data) {
        this.data = data;
    }
}