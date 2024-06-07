
public class CollectionsQueueTasks {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Size of queue is: " + queue.size());
        System.out.println("Front is: " + queue.peek());
        System.out.println("First remove from queue is: " + queue.dequeue());
        System.out.println("New front is: " + queue.peek());
    }
}
