import java.util.NoSuchElementException;

public class MyQueue<T> {

    public QNode<T> front;
    public QNode<T> back;
    public int size;

    public boolean isEmpty() {
        return front == null;
    }

    public T peek(){
        return front.value;
    }

    public void enqueue(T item){
        QNode<T> node = new QNode<>(item);
        if (isEmpty()){
            front = back = node;
        }else{
            back.next = node;
            back = node;
        }
        size++;
    }

    public T dequeue(){
        QNode<T> frontNode;
        if (isEmpty()) throw new NoSuchElementException();
        if (front == back){
            frontNode = front;
            front = back = null;
        }else{
            frontNode = front;
            front = front.next;
        }
        size--;
        return frontNode.value;
    }

    public int size(){
        return this.size;
    }

    public void printQueue(){
        if (isEmpty()) return;
        QNode<T> current = front;
        while (current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }


}
