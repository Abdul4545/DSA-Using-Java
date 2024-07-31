package Queue;

public class ArrayImplementation {

    public static class queueArray {
        int front = -1, rear = -1, size = 0;
        int arr[] = new int[40];


        // add function
        void add(int num) {

            if(rear == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }

            if(front == -1) {
                front++;
                rear++;
                arr[rear] = num;
                
            }

            else {
                rear++;
                arr[rear] = num;
            }

            size++;
        }


        // remove
        int remove() {

            if(size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int removed = arr[front];
            front = front + 1;
            size--;
            return removed;
            
        }

        // peek
        int peek() {
            if(size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int peek = arr[front];
            return peek;
        }

        // isEmpty
        boolean isEmpty() {
            if(size == 0) {
                return true;
            }
            return false;
        }

        // size 
        int size() {
            return size;
        }


        // display
        void display() {

            if(size == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            else {
                for(int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] +" ");
                }
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        queueArray q = new queueArray();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);

        q.display();

        System.out.println("size is : " + q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());


        
    }
    
}
