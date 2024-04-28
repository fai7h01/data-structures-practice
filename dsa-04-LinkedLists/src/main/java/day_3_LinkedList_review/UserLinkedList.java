package day_3_LinkedList_review;

public class UserLinkedList {
    UserNode head;
    UserNode tail;
    int size; // this will hold number of elements in list

    public UserLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty(){
        return head == null;
    }

    void insertLast(UserNode node){
        //if list is empty
        if (isEmpty()){
            head = tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void printNames(){
        if (isEmpty()) System.out.println("list is empty!");
        UserNode current = head;
        while(current != null){
            System.out.print(current.name + " => ");
            current = current.next;
        }
    }

}
