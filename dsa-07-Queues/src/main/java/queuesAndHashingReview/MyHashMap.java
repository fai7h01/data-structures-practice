package queuesAndHashingReview;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

    List<BucketLinkedList> list;
    int modulusNumber;

    public MyHashMap(){
        this.list = new ArrayList<>();
        this.modulusNumber = 2003;
        for (int i = 0; i < 2003; i++) {
            this.list.add(new BucketLinkedList());
        }
    }


    public void put(int key, int value){
        //calculate index from key with modulus
        int index = key % modulusNumber;
        list.get(index).put(key, value);
    }

    public int get(int key){
        int index = key % modulusNumber;
        return list.get(index).get(key);
    }

    public void remove(int key){
        int index = key % modulusNumber;
        list.get(index).remove(key);
    }

}
