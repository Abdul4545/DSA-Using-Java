package Linked_List;

public class EvenOddNodes {

    
    static Node oddEvenNodes(Node head) {

        if (head == null) return null; 
    
        Node evenList = new Node(0);
        Node oddList = new Node(0);
    
        Node tempe = evenList;
        Node tempo = oddList;
        Node temp = head;
    
        while (temp != null) {
            if (temp.data % 2 == 0) {
                tempe.nextNode = temp;
                tempe = tempe.nextNode;
            } else {
                tempo.nextNode = temp;
                tempo = tempo.nextNode;
            }
            temp = temp.nextNode;
        }
    
        tempe.nextNode = null;
        tempo.nextNode = null;
    
        tempo.nextNode = evenList.nextNode;
    
        return oddList.nextNode;
    }
    
    

    public static void main(String[] args) {
        
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(11);
        Node e = new Node(16);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
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
