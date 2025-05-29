
public class Bubble_sort {

    // ✅ Bubble sort ✅
    static void bubblesort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 3, 2, 11, 2, 1 };
        int n = arr.length;
        bubblesort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}