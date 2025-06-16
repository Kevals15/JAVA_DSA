package Array.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumInteger {

    public static int[] findTwoSumBrute(int[] arr, int target) {
        // Brute force
        // TC = O(NXN)
        int n = arr.length;
        int[] ans = new int[2];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    // Better Approach
    // TC = O(N x nlogn)
    public static int[] findTwoSumBetter(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rem = target - arr[i];

            if (mpp.containsKey(rem)) {
                ans[0] = mpp.get(rem);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }

    // Optimal Approach
    public static int[] findTwoSumOptimal(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
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
                ans[0] = left;
                ans[1] = right;
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 9, 6, 8 };
        int target = 14;
        int[] ans = new int[2];
        ans = findTwoSumOptimal(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
