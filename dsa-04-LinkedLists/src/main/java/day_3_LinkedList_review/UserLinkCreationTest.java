package day_3_LinkedList_review;

public class UserLinkCreationTest {
    public static void main(String[] args) {

        UserLinkedList list = new UserLinkedList();
        list.printNames();
        list.insertLast(new UserNode("Luka", "V"));
        list.insertLast(new UserNode("Steven", "G"));
        list.insertLast(new UserNode("Aaron", "H"));
        list.printNames();

    }
}
