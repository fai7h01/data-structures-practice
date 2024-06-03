package reverseLL;

public class ReverseLL {
    public static void main(String[] args) {

        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.printNodes();
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();

    }

    static void reverse(MySinglyLinkedList list) {
        //create two pointers
        Node prev = list.head;
        Node curr = prev.next;
        //iterate untill curr = null
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        //now adjust tail and head
        list.tail = list.head;
        list.tail.next = null;
        list.head = prev;

    }


}
