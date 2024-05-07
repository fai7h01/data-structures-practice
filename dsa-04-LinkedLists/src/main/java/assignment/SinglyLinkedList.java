package assignment;

public class SinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while(current != null){
            if (current.next == null){
                System.out.println(current.value + " => null");
            }else{
                System.out.print(current.value + " => ");
            }
            current = current.next;
        }
    }

    void addFirst(int value){
        Node node = new Node(value);
        if (isEmpty()){
            head = tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }

    void addLast(int value){
        Node node = new Node(value);
        if (isEmpty()){
            head = tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    int indexOf(int value){
        if (isEmpty()) return -1;

        Node current = head;
        int index = 0;
        while(current != null){
            if (current.value == value){
                return index;
            }else{
                index++;
            }
            current = current.next;
        }
        throw new IllegalArgumentException("Element not found " + value + ".");
    }


}
