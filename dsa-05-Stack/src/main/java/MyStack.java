import java.util.NoSuchElementException;

public class MyStack<T> {

    SNode<T> bottom;
    SNode<T> top;
    int size;

    boolean isEmpty(){
        return bottom == null;
    }

    void push(T item){
        SNode<T> node = new SNode<>(item);
        if (isEmpty()) bottom = top = node;
        else {
            top.next = node;
            top = node;
        }
        size++;
    }

    T peek(){
        return top.value;
    }

    T pop(){
        SNode<T> peekNode;
        if (isEmpty()) throw new NoSuchElementException();
        //stack has one element
        if (top == bottom){
            peekNode = top;
            top = bottom = null;
        }else{ // more than one element
            peekNode = top;

        }
    }

}
