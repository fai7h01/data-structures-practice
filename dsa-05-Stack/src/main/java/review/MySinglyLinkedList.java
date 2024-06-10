package review;

public class MySinglyLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    T removeFirst(){
        if (isEmpty()) return null;
        T result = null;
        if(head == tail){
            result = head.value;
            head = tail = null;
        }else{
            head = head.next;
            head.next = null;
        }
        size--;
        return result;
    }


    void add(T value) {
        //create a new node object from data
        Node<T> node = new Node<T>(value);
        if (isEmpty()) { // if the link is empty
            head = tail = node;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void addFirst(T id){
        Node<T> node = new Node(id);
        if (isEmpty()){
            head = tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;

    }


    void deleteById(T value) {
        // check if empty
        if (isEmpty()) System.out.println("List is empty.");

        Node<T> prev = head;
        Node<T> current = head;

        while (current != null) {
            if (current.value == value) { // if there is a match
                // case 1: head
                if (current == head) {
                    head = current.next;
                    current.next = null;
                }
                // case 2: tail
                else if (current == tail) {
                    tail = prev;
                    prev.next = null; // Ex - tail will be eligible for garbage collection
                }
                // case 3: middle
                else {
                    prev.next = current.next;
                    current.next = null;
                }
                // after deletion
                size--;
            }
            // move forward on the elements of the list
            prev = current;
            current = current.next;
        }


    }

    int indexOf(T value){
        if (isEmpty()) return -1;
        int position = 0;
        Node<T> current = head;
        while (current != null) {
            if (current.value == value) return position;
            position++;
            current = current.next;
        }
        return -1;
    }


    void printNodes() {
        Node<T> current = head;
        while (current != null) {
            if (current.next == null)
                System.out.println(current.value + " => null");
            else
                System.out.print(current.value + " => ");
            current = current.next;
        }
    }

}
