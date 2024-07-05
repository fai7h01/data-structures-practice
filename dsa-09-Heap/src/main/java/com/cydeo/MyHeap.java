package com.cydeo;

public class MyHeap {

    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }


    public void insert(int value) {
        if (size == items.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        items[size++] = value;
        bubbleUp();
    }

    public void bubbleUp() {
        // calculate start point/index
        int index = size - 1;
        // while index > 0 && parent < child -> continue
        // 1. swap parent and child
        // 2. calculate next index -> parent index
        while (index > 0 && items[index] > items[parentIndex(index)]){
            swap(index,parentIndex(index));
            index = parentIndex(index);
        }
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
            return items[leftChildIndex(index)] > items[rightChildIndex(index)] ?
                    leftChildIndex(index) : rightChildIndex(index);
        }
    }

    public void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public boolean isValidParent(int index) {
        if (!hasLeftChild(index)) {
            return true;
        } else {
            boolean isValid = items[index] >= items[leftChildIndex(index)];
            if (hasRightChild(index)) {
                isValid = items[index] >= items[rightChildIndex(index)];
            }
            return isValid;
        }
    }


}
