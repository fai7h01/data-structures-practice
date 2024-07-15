public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int data = 6;
        System.out.println(binarySearchIterative(numbers, data));
        System.out.println(binarySearchRecursive(numbers, data));

    }

    public static int binarySearchIterative(int[] array, int data) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == data) {
                return middle;
            }
            if (data < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] array, int data) {
        return binarySearchRecursive(array, data, 0, array.length - 1);
    }

    public static int binarySearchRecursive(int[] array, int data, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == data) {
            return middle;
        }
        if (data < array[middle]) {
            return binarySearchRecursive(array, data, left, middle - 1);
        } else {
            return binarySearchRecursive(array, data, middle + 1, right);
        }
    }

}
