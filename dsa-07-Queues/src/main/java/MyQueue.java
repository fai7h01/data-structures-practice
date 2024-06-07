import java.util.NoSuchElementException;

public class MyQueue<T> {

    QNode<T> front;
    QNode<T> back;
    int size;

    boolean isEmpty() {
        return front == null;
    }

    T peek(){
        return front.value;
    }

    void enqueue(T item){
        QNode<T> node = new QNode<>(item);
        if (isEmpty()){
            front = back = node;
        }else{
            back.next = node;
            back = node;
        }
        size++;
    }

    T dequeue(){
        QNode<T> frontNode;
        if (isEmpty()) throw new NoSuchElementException();
        if (front == back){
            frontNode = front;
            front = back = null;
        }else{
            frontNode = front;
            front = front.next;
        }
        return frontNode.value;
    }

    int size(){
        return this.size;
    }

    void printQueue(){
        if (isEmpty()) return;
        QNode<T> current = front;
        while (current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }


}
