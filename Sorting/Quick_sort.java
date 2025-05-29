package Sorting;

public class Quick_sort {

    static int partition(int[] arr, int left, int right) {
        int pivot = left;
        int i = left;
        int j = right;

        while (i < j) {
            while (arr[i] <= arr[pivot] && i <= right - 1) {
                i++;
            }

            while (arr[j] > arr[pivot] && j >= left + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        return j;
    }

    static void quicksort(int arr[], int left, int right) {
        if (left < right) {
            int paridx = partition(arr, left, right);
            quicksort(arr, left, paridx - 1);
            quicksort(arr, paridx + 1, right);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 3, 2, 11, 2, 1 };
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}