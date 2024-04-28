package day_3_LinkedList_review;

public class UserLinkedList {
    User head;
    User tail;
    int size; // this will hold number of elements in list

    public UserLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty(){
        return head == null;
    }

    void insertLast(User node){
        //if list is empty
        if (isEmpty()){
            head = tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

}
