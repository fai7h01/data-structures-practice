public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int value) {
        //create a new node object from data
        Node node = new Node(value);
        if (isEmpty()) { // if the link is empty
            head = tail = node;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void addFirst(int id){
        Node node = new Node(id);
        if (isEmpty()){
            head = tail = node;
        }else{
            node.next = head;
            head = node;;
        }
        size++;

    }


    void deleteById(int id) {
        // check if empty
        if (isEmpty()) System.out.println("List is empty.");

        Node prev = head;
        Node current = head;

        while (current != null) {
            if (current.id == id) { // if there is a match
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

    int indexOf(int id){
        if (isEmpty()) return -1;
        int position = 0;
        Node current = head;
        while (current != null) {
            if (current.id == id) return position;
            position++;
            current = current.next;
        }
        return -1;
    }


    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null)
                System.out.println(current.id + " => null");
            else
                System.out.print(current.id + " => ");
            current = current.next;
        }
    }

}
