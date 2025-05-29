public class Insertion_sort {

    static void insertionsort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i;
            while (j != 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 3, 2, 11, 2, 1 };
        int n = arr.length;
        insertionsort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}