package mergeTwoSortedLL;

public class Solution {

    public Node mergeTwoLists(Node curr1, Node curr2) {
        //create a dummy head node
        Node tempHead = new Node();
        Node prev = tempHead;
        while (curr1 != null && curr2 != null){
            if (curr1.value <= curr2.value){
                prev.next = curr1;
                curr1 = curr1.next;
            }else{
                prev.next = curr2;
                curr2 = curr2.next;
            }
            prev = prev.next;
        }
        //check if there is any leftover
        if (curr1 == null){
            prev.next = curr2;
        }else{
            prev.next = curr1;
        }
        return tempHead.next;
    }

}
