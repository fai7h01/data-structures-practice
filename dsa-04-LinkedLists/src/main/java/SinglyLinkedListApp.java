public class SinglyLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList linkedList = new MySinglyLinkedList();

        System.out.println(linkedList.isEmpty());

        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        linkedList.printNodes();
        linkedList.deleteById(7);
        linkedList.printNodes();
        System.out.println(linkedList.indexOf(8));
    }
}
