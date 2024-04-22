public class LinkedListDemo {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("Node 1 address is: " + node1 + " Node 1 next address is: " + node1.next);
        System.out.println("Node 2 address is: " + node2 + " Node 2 next address is: " + node2.next);
        System.out.println("Node 3 address is: " + node3 + " Node 3 next address is: " + node3.next);
        System.out.println("Node 4 address is: " + node4 + " Node 4 next address is: " + node4.next);

        Node current;
        Node head = node1;
        current = head;
        while(current != null){
            System.out.println("Id of node is: " + current.id);
            current = current.next;
        }

    }

}
