public class InsertionSort {

    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int temp = arr[i];
            int j = i;
            for (; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = SortTestHelper.generateRandomArray(30, 0, 30);
        SortTestHelper.printArray(arr);
        InsertionSort.sort(arr);
        SortTestHelper.printArray(arr);
    }
}
