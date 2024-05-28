package practice;

public class MyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return size == 0;
    }

    void print(){
        if (isEmpty()){
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null){
            System.out.print(current.value + " => ");
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
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    int indexOf(int value){
        if (isEmpty()) return -1;
        int position = 0;
        Node current = head;
        while(current != null){
            if (current.value == value){
                return position;
            }else{
                current = current.next;
                position++;
            }
        }
        return -1;
    }

    int getKthElementFromLast(int k){
        if (isEmpty()) return -1;
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k - 1; i++) {
            p2 = p2.next;
        }
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.value;
    }

    void removeKthElementFromLast(int k){
        if (isEmpty()){
            System.out.println("List is empty.");
            return;
        }
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

        if (p1 == head){
            head = p1.next;
            p1.next = null;
        } else if (p1 == tail) {
            tail = prev;
            prev.next = null;
        }else{
            prev.next = p1.next;
            p1.next = null;
        }
        size--;

    }

}
