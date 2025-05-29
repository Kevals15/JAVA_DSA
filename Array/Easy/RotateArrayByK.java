//Brute Force approach using 
// sc = o(k)
// tc = o(n-d)
// put = o(k)
// Overaall Complexity o(n+k) 

import java.util.Arrays;

// public class RotateArrayByK {

//     public int[] rotatebyk(int[] arr, int k) {
//         int n = arr.length;
//         k = k % n;
//         int[] temp = new int[k];
//         for (int i = 0; i < k; i++) {
//             temp[i] = arr[i];
//         }

//         for (int i = k; i < n; i++) {
//             arr[i - k] = arr[i];
//         }

//         for (int i = n - k; i < n; i++) {
//             arr[i] = temp[i - (n - k)];
//         }
//         return arr;
//     }

//     public static void main(String[] args) {
//         RotateArrayByK rk = new RotateArrayByK();
//         int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//         int k = 13;
//         rk.rotatebyk(arr, k);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// Optimal Approch
public class RotateArrayByK {

    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        Reverse(arr, 0, n - k - 1);
        Reverse(arr, n - k, n - 1);
        Reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
