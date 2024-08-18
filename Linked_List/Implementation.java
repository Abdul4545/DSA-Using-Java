package Linked_List;

public class Implementation {

    public static void main(String[] args) {

        linkedList list1 = new linkedList();

        list1.insertAtEnd(4);
        list1.insertAtEnd(6);

        // list1.display();

        // System.out.println();

        // System.out.println(list1.size());

        list1.insertAtEnd(12);
        // list1.display();
        // System.out.println(list1.size());

        list1.insertAtHead(20);
        // list1.display();

        list1.insertAtHead(24);
        // list1.display();

        list1.insertAt(2, 30);
        // list1.display();

        list1.insertAt(6, 50);
        // list1.display();

        list1.insertAt(0, 2);
        // list1.display();

        // System.out.println(list1.head.data);
        // System.out.println(list1.tail.data);
        // System.out.println(list1.tail.nextNode);

        // System.out.println(list1.getElementAtIndex(5));
        // System.out.println(list1.getElementAtIndex(0));
        // System.out.println(list1.getElementAtIndex(-17));
        // System.out.println(list1.getElementAtIndex(17));

        list1.deleteAtIndex(5);
        list1.display();

        list1.deleteAtIndex(6);
        list1.display();

        list1.deleteAtIndex(0);
        list1.display();  
        
        list1.deleteNode(null);
    }
    
}


class Node {
    int data;
    Node nextNode;

    Node(int data) {
        this.data = data;
    }
}


class linkedList {

    Node head = null;
    Node tail = null;


    // insert node at end
    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = temp;
        }

        else {
            tail.nextNode = temp;
        }
        tail = temp;
    }

    // insert node at head
    void insertAtHead(int val) {
        Node temp = new Node(val);

        if(head == null) {
            head = tail = temp;
            // insertAtEnd(val);
        }

        else {
            temp.nextNode = head;
            head = temp;
        }
    }

    // Insert a node at any given index.
    void insertAt(int index, int val) {
        Node t = new Node(val);
        Node temp = head;
        if(index == size()) {
            insertAtEnd(val);
            return;
        }

        else if(index == 0) {
            insertAtHead(val);
        }

        else if(index < 0 || index > size()) {
            System.out.println("Wrong Index");
            return;
        }

        else {
            for(int i = 1; i < index-1; i++) {
                temp = temp.nextNode;
            }

            t.nextNode = temp.nextNode;
            temp.nextNode = t;
        }
    }


    // Method to return the element at given index
    int getElementAtIndex(int index) {
        
        Node temp = head;
        if(index > size() || index < 0) {
            return -1; 
        }
        else {
            for(int i = 0; i < index; i++) {
                temp = temp.nextNode;
            }
        }
        return temp.data;
    }


    // Delete a node at a given index
    void deleteAtIndex(int index) {
        if(index == 0) {
            head = head.nextNode;
            return;
        }

        Node temp = head;
        for(int i = 0; i < index-1; i++) {
            temp = temp.nextNode;
        }
        temp.nextNode = temp.nextNode.nextNode;

        if(index == size() - 1) {
            tail = temp;
        }
    }

    
    // node is not the last node that is tail
    void deleteNode(Node node) {
        node.data = node.nextNode.data;
        node.nextNode = node.nextNode.nextNode;
    }


    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }

        System.out.println();
    }


    int size() {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.nextNode;
        }
        return count;
    }
}
