public class SelectionSort {

    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            SortTestHelper.swap(arr, i, minIndex);
        }
    }

    public static void main(String[] args) {

        int[] arr = SortTestHelper.generateRandomArray(20, 0, 20);
        SortTestHelper.printArray(arr);
        SelectionSort.sort(arr);
        SortTestHelper.printArray(arr);
    }
}
