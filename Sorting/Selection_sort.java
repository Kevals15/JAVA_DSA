package Sorting;

public class Selection_sort {

    // ✅ Selection sort ✅
    static void selectionsort(int arr[], int n) {
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 3, 2, 11, 2, 1 };
        int n = arr.length;
        selectionsort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}