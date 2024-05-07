package assignment;

public class Test {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();;

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.print();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.print();

        int val = 3;

        System.out.println("index of " + val + ": " + list.indexOf(val));

        System.out.println(list.getKthElementFromLast(6));

        list.removeKthElementFromLast(3);

        list.print();
    }
}
