package day_3_LinkedList_review;

public class UserLinkCreationTest {
    public static void main(String[] args) {

        User user1 = new User(1, "Austin");
        User user2 = new User(2, "Jason");
        User user3 = new User(3, "Carol");
        User user4 = new User(4, "Jack");
        user1.next = user2;
        user2.next = user3;
        user3.next = user4;

        User current = user1;
        while(current != null){
            System.out.println(current.id + " : " + current.name);
            current = current.next;
        }


    }
}
