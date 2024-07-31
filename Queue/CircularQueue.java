package Queue;

public class CircularQueue {

    public static class circularQueue {
        int front = -1, rear = -1, size = 0;
        int n = 5;

        private int arr[] = new int[n];

        void add(int x) throws Exception {
            if(size == 0) {
                front = rear = 0;
                arr[0] = x;
                size++;
            }

            else if(size == arr.length) {
                throw new Exception("Queue is Full");
            }

            else if(rear < n-1) {
                arr[++rear] = x;
                size++;

            }

            else if(rear == n-1) {
                rear = 0;
                arr[0] = x;
                size++;
            }
        }

        void remove() throws Exception {

            if(size == 0) {
                throw new Exception("Queue is Empty!");
                
            }

            else if(front < n-1) {
                System.out.println(arr[front]);
                front++;
                size--;
                return;
            }

            else if(front == n-1) {
                System.out.println(arr[front]);
                front = 0;
                size--;
                return;
            }

            else {
                System.out.println(arr[front]);
                front++;
                size--;
                return;
            }
        }

        int peek() throws Exception {
            if(size == 0) {
                throw new Exception("Queue is Empty!");
                
            }

            else  {
                return arr[rear];
            }
        }

        boolean isEmpty() {
            if(size == 0) {
                return true;
            }

            return false;
        }

        void display() {
            if(size == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            else if(front <= rear) {
                for(int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

            else {
                for(int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }

                for(int i = 0 ; i <= rear; i++) {
                    System.out.print(arr[i]+ " ");
                }
            }

            System.out.println();

        }
    
        
    }

    public static void main(String[] args) throws Exception {

        circularQueue q = new circularQueue();
        q.display();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();

        q.remove();
        q.remove();

        q.add(6);
        q.add(7);

        q.display();

        // q.add(10);
        
    }
    
}
