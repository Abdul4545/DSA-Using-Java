class Node {
    int data;
    Node nexNode;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList1 {
    Node head = null;
    Node tail = null;


    void add(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = temp;
        }
        else {
            tail.nexNode = temp;
        }
        tail = temp;
    }


    void dispalyList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.nexNode;
        }
        System.out.println("END");
    }

    void insertAt(int val, int index) {
        Node temp = new Node(val);
        Node temp2 = head;

        int i = 0;

        while(i < index - 1) {
            temp2 = temp2.nexNode;
            i++;
        }

        temp.nexNode = temp2.nexNode;
        temp2.nexNode = temp;
    }
}

public class LinkedList {

    public static void main(String args[]) {
        LinkedList1 list1 = new LinkedList1();

        list1.add(0);
        list1.add(10);
        list1.add(30);
        list1.add(40);


        list1.dispalyList();
        list1.insertAt(50, 2);
        list1.dispalyList();
    } 
}
