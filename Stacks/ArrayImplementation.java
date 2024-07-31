package Stacks;

public class ArrayImplementation {
    
    public static class  Stack {

        int arr[] = new int[50];
        int index = 0;

        void push(int x) {

            if(isFull()) {
                System.out.println("Stack is Full");
                return;
            }

            arr[index] = x;
            index++;
        }

        int peak() {
            if(index == 0){
                System.out.println("Stack is Empty");
                return -1;
            }

            return arr[index-1];
        }

        int pop() {
            if(index == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = arr[index-1];
            arr[index-1] = 0;
            index--;

            return top;
        }

        void display() {
            for(int i = 0; i <= index-1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


        int size() {
            return index;
        }


        boolean isEmpty() {
            if(size() == 0) {
                return true;
            }

            return false;
        }

        boolean isFull() {
            if(index == arr.length) {
                return true;
            }

            return false;
        }

        int capacity() {
            return arr.length;
        }  
    }


    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(12);
        st.push(23);
        st.push(34);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
        
    }
}
