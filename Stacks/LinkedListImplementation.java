package Stacks;

public class LinkedListImplementation {

    static class Stack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayRec(Node h) {
            if(h == null) {
                return;
            }

            displayRec(h.next);
            System.out.print(h.data + " ");
        }

        void display() {
            displayRec(head);
            System.out.println();
        }

        int size() {
            return size;
        }

        int pop() {
            if(head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        int peak() {
            if(head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            int val = head.data;
            return val;
        }

        boolean isEmpty() {
            if (head == null) {
                return true;
            }

            else {
                return false;
            }
        }
    }
    
    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(12);
        st.display();
        st.push(23);
        st.push(34);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
        
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
