package Day_01_Review;

import java.util.ArrayList;

public class BigOExamples {
    public static void main(String[] args) {
        int n=100; //Data Size
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr1.add(i);
        }
      //logComplexity(n);
        int[] array={1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(binarySearchIterative(array, 12));

    }
   // Big -O Constant Time
    public static void find0(int dataSize){

            System.out.println(1);

    }

    // O(n) Time Complexity
    public static void find1(int dataSize){
        System.out.println(dataSize);
        for (int i = 0; i < dataSize; i++) {
            int a=+1;
        }
    }
    // O(log n)

    public static void logComplexity(int dataSize){
        int numberOfOperations=0;
        long startTime;
        long endTime;
        startTime=System.currentTimeMillis();
        for (int i = 1; i < dataSize ; i*=2) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println( "Logarithmic Number of operations  : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");
    }









    public static int binarySearchIterative(int[] array, int data){
        int left=0;
        int right= array.length-1;
        int operations=0;
        while (left<=right){
            int middle= (left+right)/2;
            if(array[middle]==data) {
                System.out.println("number of operations in Bin Search is: " +operations);
                return middle;
               }
            if (data<array[middle]) right= middle-1;
            else left=middle+1;
            operations++;
        }
        return -1;
    }
}
