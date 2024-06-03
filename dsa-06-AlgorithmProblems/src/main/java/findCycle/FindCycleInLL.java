package findCycle;

import java.util.HashSet;
import java.util.Set;

public class FindCycleInLL {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(isCycle(node1));
    }

    public static boolean isCycle(Node head){
        Set<Node> set = new HashSet<>();
        Node current = head;
        while(current != null){
            if (set.contains(current)) return true;
            set.add(current);
            current = current.next;
        }
        return false;
    }

}
