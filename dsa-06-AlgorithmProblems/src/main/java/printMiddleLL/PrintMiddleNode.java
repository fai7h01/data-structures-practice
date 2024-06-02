package printMiddleLL;

public class PrintMiddleNode {
    public static void main(String[] args) {

        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 1; i <= 7; i++) {
            list.add(i);
        }
        list.printNodes();
        printMiddle(list);

    }

    public static void printMiddle(MySinglyLinkedList list){
        //create two pointers
        Node slow = list.head;
        Node fast = list.head;
        //iterate over linked list
        while (fast != list.tail && fast.next != list.tail){ // if its tail -> odd, if its before tail -> even
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == list.tail){
            System.out.println(slow.id);
        }else{
            System.out.println(slow.id + " - " + slow.next.id);
        }
    }

}
