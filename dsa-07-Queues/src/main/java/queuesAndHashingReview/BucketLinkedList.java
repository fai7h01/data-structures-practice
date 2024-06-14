package queuesAndHashingReview;

import java.util.LinkedList;

public class BucketLinkedList {

    LinkedList<KeyValue<Integer,Integer>> bucketList;

    public BucketLinkedList() {
        bucketList = new LinkedList<>();
    }

    public int get(int key){
        //basic search with loop return value if key matches
        for (KeyValue<Integer, Integer> pair : bucketList) {
            if (pair.key == key) return pair.value;
        }
        return -1;
    }

    public void put(int key, int value){
        //if there is match update value
        for (KeyValue<Integer, Integer> pair : bucketList) {
            if (pair.key == key){
                pair.value = value;
            }
            return;
        }
        //if no match add it
        this.bucketList.add(new KeyValue<>(key, value));
    }

    public void remove(int key){
        for (KeyValue<Integer, Integer> pair : bucketList) {
            if (pair.key == key){
                this.bucketList.remove(pair);
                return;
            }
        }
    }
}
