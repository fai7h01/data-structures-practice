package com.cydeo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {

        int[] numbers = {3,2,1,5,6,4};
        System.out.println(getKthLargest(numbers,2));
        System.out.println(findKthLargest(numbers,2));
        System.out.println(findKthLargest2(numbers,2));

    }

    static int getKthLargest(int[] nums, int k){
        MyHeap heap = new MyHeap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            heap.insert(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            heap.remove();
        }
        return heap.peek();
    }

    static int findKthLargest(int[] nums, int k){

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }
        return maxHeap.peek();

    }

    static int findKthLargest2(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
