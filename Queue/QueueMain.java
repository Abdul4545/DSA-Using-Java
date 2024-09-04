package Queue;

public class QueueMain  {

    public static void main(String[] args) throws Exception {
        
        CustomQueue queue = new CustomQueue(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        queue.display();
    }

}
