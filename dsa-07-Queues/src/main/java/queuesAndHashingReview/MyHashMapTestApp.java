package queuesAndHashingReview;

public class MyHashMapTestApp {
    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);
        System.out.println(map.get(1));
        System.out.println(map.get(4));

    }
}
