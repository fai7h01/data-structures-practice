public class ExponentialSearch {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int data = 6;

        System.out.println(exponentialSearch(numbers,data));

    }

    public static int exponentialSearch(int[] array, int data){
        int bound = 1;
        while(bound < array.length && array[bound] < data){
            bound *= 2;
        }
        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);
        return BinarySearch.binarySearchRecursive(array,data,left,right);
    }

}
