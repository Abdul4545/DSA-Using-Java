package Queue;

public class LinkedListImplementation {

    public static class ListQueue {
        Node head = null;
        Node tail = null;
        int size = 0;

        // add()
        void add(int num) {
            Node temp = new Node(num);
            if(size == 0) {
                head = tail = temp;
            }

            else {
                tail.nextNode = temp;
                tail = temp;
            }
            size++;
        }


        // peek()
        int peek() {
            if(size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return head.data;  
        }


        // remove
        void remove() {
            if(size == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            else {
                System.out.println(head.data);
                head = head.nextNode;
                size--;
                return;
            }
  
        }

        // display()
        void display() {
            Node temp = head;
            if(size == 0) {
                System.out.println("Queue is Empty!");
                return;
            }

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.nextNode;
            }
        }
    
    }

    public static void main(String[] args) {

        ListQueue q = new ListQueue();
        q.remove();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);

        q.display();

        System.out.println(q.peek());

        q.remove();
        q.display();
        
    }
    
}




class Node {
    int data;
    Node nextNode;;
    
    Node(int data) {
        this.data = data;
    }
}
