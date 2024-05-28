import java.util.NoSuchElementException;

public class MyStack<T> {

    SNode<T> bottom;
    SNode<T> top;
    int size;

    boolean isEmpty() {
        return bottom == null;
    }

    void print(){
        if (isEmpty()) return;
        SNode<T> current = bottom;
        while (current != null){
            if (current.next == null){
                System.out.print(current.value + " => null");
            }else{
                System.out.print(current.value + " => ");
            }
            current = current.next;
        }
        System.out.println();
    }

    void push(T item) {
        SNode<T> node = new SNode<>(item);
        if (isEmpty()) bottom = top = node;
        else {
            top.next = node;
            top = node;
        }
        size++;
    }

    T peek() {
        return top.value;
    }

    T pop() {
        SNode<T> peekNode;
        if (isEmpty()) throw new NoSuchElementException();
        //stack has one element
        if (top == bottom){
            peekNode = top;
            bottom = top = null;
        }else{ // more than one element
            peekNode = top;
            SNode<T> prev = bottom;
            while(prev.next != top){
                prev = prev.next;
            }
            prev.next = null;
            top = prev;
        }
        size--;
        return peekNode.value;
    }
}
