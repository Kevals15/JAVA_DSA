package Array.Medium;

import java.util.Arrays;

public class SortArrayof012s {

    // Better Approach
    public static void sortArray012sBetter(int[] arr) {
        int ones = 0, twos = 0, zeros = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zeros++;
            else if (arr[i] == 1)
                ones++;
            else
                twos++;
        }
        int idx = 0;
        for (int i = 0; i < zeros; i++) {
            arr[idx++] = 0;
        }

        for (int i = zeros; i < (zeros + ones); i++) {
            arr[idx++] = 1;
        }

        for (int i = (zeros + ones); i < n; i++) {
            arr[idx++] = 2;
        }
    }

    // We can use moore's voting algorithm
    // 0 to low-1 has value of 0's
    // low to mid-1 has value of 1's
    // mid to high has unsorted array
    // mid+1 to n has all 2's
    public static void sortArray012sOptimal(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap value of arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // Now we need to swap value of arr[mid] with arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 0, 0, 1, 2, 1, 0, 0, 2 };
        sortArray012sOptimal(arr);
        System.out.println(Arrays.toString(arr));
    }
}
