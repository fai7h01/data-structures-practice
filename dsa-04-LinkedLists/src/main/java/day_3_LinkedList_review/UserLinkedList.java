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

    void get(int index){
        if (index >= size){
            System.out.println("index out of bounds");
            return;
        }else{
            UserNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            System.out.println("index " + index + " is = " + current.name);
        }
    }

    UserNode get2(int index){
        if (index >= size){
            throw new IndexOutOfBoundsException();
        }else{
            UserNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }
    }
}
