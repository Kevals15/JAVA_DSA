package Array.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumTrueFalse {

    public static String findTwoSum(int[] arr, int target) {
        // Brute Force Approach
        // TC=O(NxN)
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] + arr[i] == target) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    // Better Approach Using Hashing
    // TC = O(N x nlogn)

    public static String findTwoSumBetter(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rem = target - arr[i];

            if (mpp.containsKey(rem)) {
                return "YES";
            }

            mpp.put(arr[i], i);
        }
        return "NO";
    }

    public static String findTwoSumOptimal(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        int sum = 0;
        while (left <= right) {
            sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 9, 6, 8 };
        int target = 4;
        String ans = findTwoSumOptimal(arr, target);
        System.out.println(ans);
    }
}