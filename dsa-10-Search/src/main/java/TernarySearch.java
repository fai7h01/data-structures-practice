public class TernarySearch {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int data = 6;

        System.out.println(ternarySearch(numbers, data));
        System.out.println(ternarySearchRecursive(numbers, data, 0, numbers.length - 1));

    }

    public static int ternarySearch(int[] array, int data) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int partition = (right - left) / 2;
            int mid1 = left + partition;
            int mid2 = right - partition;
            if (array[mid1] == data) {
                return mid1;
            }
            if (array[mid2] == data) {
                return mid2;
            }
            if (data < array[mid1]) {
                right = mid1 - 1;
            } else if (data > array[mid2]) {
                left = mid2 + 1;
            } else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }
        return -1;
    }

    public static int ternarySearchRecursive(int[] array, int data, int left, int right) {
        if (left > right) {
            return -1;
        }
        int partition = (right - left) / 2;
        int mid1 = left + partition;
        int mid2 = right - partition;
        if (array[mid1] == data) {
            return mid1;
        }
        if (array[mid2] == data) {
            return mid2;
        }
        if (data < array[mid1]) {
            return ternarySearchRecursive(array, data, left, mid1 - 1);
        } else if (data > array[mid2]) {
            return ternarySearchRecursive(array, data, mid2 + 1, right);
        } else {
            return ternarySearchRecursive(array, data, mid1 + 1, mid2 - 1);
        }
    }

}
