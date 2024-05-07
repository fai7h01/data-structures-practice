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

    //get kth item from last
    int getKthElementFromLast(int k){
        //create two pointers
        Node p1 = head;
        Node p2 = head;
        // move p2 k - 1 times
        for (int i = 0; i < k - 1; i++) {
            p2 = p2.next;
        }
        //move both pointers until p2 hits the last element
        while(p2.next != null){
           p1 = p1.next;
           p2 = p2.next;
        }
        //p1 is on the kth element from the last
        return p1.value;
    }

    void removeKthElementFromLast(int k){

        Node p1 = head;
        Node p2 = head;
        Node prev = null;

        for (int i = 0; i < k - 1; i++) {
            p2 = p2.next;
        }

        while(p2.next != null){
            prev = p1;
            p1 = p1.next;
            p2 = p2.next;
        }

        //Do delete operations
        if (p1 == head){
            head = p1.next;
            p1.next = null;
        }else if (p1 == tail){
            tail = prev;
            prev.next = null;
        }else{
            prev.next = p1.next;
            p1.next = null;
        }
        size--;
    }

}
