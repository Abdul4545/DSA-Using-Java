package Linked_List;

public class DeleteMidOfLinkedList {

    public static Node DeleteNode(Node head) {
        Node slow = head;
        Node fast = head;
        Node temp = head; 

        if( temp.nextNode == null ) {
            temp.data = -1;
            return temp;
        }
        
        while(fast.nextNode.nextNode != null && fast.nextNode.nextNode.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }

        slow.nextNode = slow.nextNode.nextNode;

        return temp;
    }

    // delete duplicates

    public static Node deleteDuplicates(Node head) {

        if(head == null) {
            return head;
        }
        Node temp = head;

        while(temp.nextNode != null) {
            if(temp.data == temp.nextNode.data) {
                temp.nextNode = temp.nextNode.nextNode;
            }

            else {
                temp = temp.nextNode;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        Node h = new Node(70);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;
        f.nextNode = g;
        g.nextNode = h;

        // Node temp1 = a;
        // Node temp2 = b;

        // DeleteNode(temp1);

        // while(temp1.nextNode != null) {
        //     System.out.print(temp1.data + " ");
        // }

        // DeleteNode(temp2);

        // while(temp1.nextNode != null) {
        //     System.out.print(temp2.data + " ");
        // }

        Node list = deleteDuplicates(a);
        Node node = list;

        while(node != null) {
            System.out.print(node.data + " ");
            node = node.nextNode;
        }

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
