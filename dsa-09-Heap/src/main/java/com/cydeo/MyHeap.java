package com.cydeo;

public class MyHeap {

    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }

    public int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    public int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    public int parentIndex(int index) {
        return (index - 1) / 2;
    }

    public boolean hasLeftChild(int index) {
        return leftChildIndex(index) < this.size;
    }

    public boolean hasRightChild(int index) {
        return rightChildIndex(index) < this.size;
    }

    public int largerChildIndex(int index) {
        // no child
        if (!hasLeftChild(index)) {
            return index;
        }
        // one child - left child
        else if (!hasRightChild(index)) {
            return leftChildIndex(index);
        } else {
            if (items[leftChildIndex(index)] > items[rightChildIndex(index)]){
                return leftChildIndex(index);
            }else{
                return rightChildIndex(index);
            }
        }
    }
}
