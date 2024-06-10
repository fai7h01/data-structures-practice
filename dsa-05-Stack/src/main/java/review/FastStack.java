package review;

public class FastStack<T> {

    MySinglyLinkedList<T> list;

    public FastStack() {
        this.list = new MySinglyLinkedList<>();
    }

    int size(){
        return list.size;
    }

    void push(T value){
        list.addFirst(value);
    }

    T pop(){
        return list.removeFirst();
    }

    void print(){
        list.printNodes();
    }
}
