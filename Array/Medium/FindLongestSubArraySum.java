package Array.Medium;

public class FindLongestSubArraySum {

    public static int findLongestSubarraySum(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    // Kadane's Algorithm if sum < 0 then dont carry forward
    // if sum > maximum asssign maximum to sum
    // Optimal Approach
    public static int findLongestSubarraySumOptimal(int[] arr) {
        int n = arr.length;
        int sum = 0, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, -1, -1, -2, 1, 9, -3 };
        int max = findLongestSubarraySumOptimal(arr);
        System.out.println(max);
    }
}
