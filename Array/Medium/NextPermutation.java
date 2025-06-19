package Array.Medium;

import java.util.Arrays;

public class NextPermutation {

    public static void reverse(int[] arr, int left, int right) {
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void findNextPermutation(int[] arr) {
        int n = arr.length;
        int idx = -1;
        // Find Break Point
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(arr, 0, n - 1);
        } else {

            // Find near largest element of idx
            for (int i = n - 1; i >= idx; i--) {
                if (arr[i] > arr[idx]) {
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                    break;
                }
            }

            reverse(arr, idx + 1, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 4, 3, 0, 0 };
        findNextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
