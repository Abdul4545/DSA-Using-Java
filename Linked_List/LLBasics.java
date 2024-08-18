package Linked_List;


class Node {
    int data;
    Node nextNode;

    Node(int data) {
        this.data = data;
    }
}

public class LLBasics {

    // funtion for printing the linked list
    static void printList(Node head) {
        Node temp = head;
        System.out.print(temp.data);
        while(temp.nextNode != null) {
            System.out.print(" -> " + temp.nextNode.data);
            temp = temp.nextNode;
        }
    }

    // displaying a linked list recursively
    static void printListr(Node head) {
        if(head == null) return;

        System.out.print(head.data +" ");
        printListr(head.nextNode);
    }



    static void printListReverse(Node head) {
        if(head == null) return;

        printListReverse(head.nextNode);
        System.out.print(head.data +" ");
    }


    // Method to find out the length of a linked list (Iterative or Recursive)
    static void listLength(Node head) {
        int count = 0;
        while(head != null) {
            count += 1;
            head = head.nextNode;
        }
        System.out.println("Total no of nodes in the linked list is : " + count);
    }

    
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(12);
        Node d = new Node(10);
        Node e = new Node(15);
        Node f = new Node(55);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;

        // traversing linked list
        // 1) using temp node
        Node temp = a;
        System.out.print(temp.data);
        while (temp.nextNode != null) {
            System.out.print(" -> " + temp.nextNode.data);
            temp = temp.nextNode;
        }

        // System.out.println();


        // 2) using head node and moving it 
        // System.out.print(a.data);
        // while (a.nextNode != null) {
        //     System.out.print(" -> " + a.nextNode.data);
        //     a = a.nextNode;
        // }

        // it is not a good way of travering a linked list. Always use function or use temp node

        // System.out.println();

        // System.out.print(a.data);
        // while (a.nextNode != null) {
        //     System.out.print(" -> " + a.nextNode.data);
        //     a = a.nextNode;
        // }

        // printList(a);

        // System.out.println();

        // printListreverse(a);

        // System.out.println();
        // listLength(a);

    }

}




    

