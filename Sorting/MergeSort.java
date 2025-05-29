public class MergeSort {

    static void mergeArray(int arr[], int start, int end, int mid) {
        int size = (end - start) + 1;
        int[] newArr = new int[size];
        int i = start;
        int j = mid + 1;
        int idx = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                newArr[idx++] = arr[i++];
            } else {
                newArr[idx++] = arr[j++];
            }
        }
        while (i <= mid) {
            newArr[idx++] = arr[i++];
        }

        while (j <= end) {
            newArr[idx++] = arr[j++];
        }

        for (int k = 0; k < idx; k++) {
            arr[start + k] = newArr[k];
        }

    }

    static void mergesort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(arr, start, mid);
            mergesort(arr, mid + 1, end);
            mergeArray(arr, start, end, mid);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 3, 2, 11, 2, 1 };
        int n = arr.length;
        mergesort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
