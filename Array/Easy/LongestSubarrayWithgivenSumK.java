import java.util.HashMap;

public class LongestSubarrayWithgivenSumK {

    public static int findlongestsubarrayWithgivensumk(int[] arr, int k) {
        int maxLength = 0;
        // Brute Force Approach
        // TC = O(NxN)
        // for (int i = 0; i < arr.length; i++) {
        // Long sum = 0;
        // for (int j = i; j < arr.length; j++) {
        // sum += arr[j];
        // if (sum == k) {
        // maxLength = Math.max(maxLength, (j - i) + 1);
        // break;
        // }
        // }
        // }

        // Better Approach
        // TC = O(N x NlogN)
        // SC = O(N)
        // This Approach only works for positive negatives not for 0

        // long sum = 0;
        // HashMap<Long, Integer> preusemap = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];

        // if (sum == k) {
        // maxLength = Math.max(maxLength, i + 1);
        // }

        // long rem = sum - k;

        // if (preusemap.containsKey(rem)) {
        // int len = i - preusemap.get(rem);
        // maxLength = Math.max(maxLength, len);
        // }

        // if (!preusemap.containsKey(rem)) {
        // preusemap.put(sum, i);
        // }

        // }

        // Optimal Approach
        // 2 pointer Approach
        // TC = O(2N)
        int sum = arr[0];
        int right = 0;
        int left = 0;
        int n = arr.length;

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < n)
                sum += arr[right];
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 4, 5 };
        int k = 6;
        int len = findlongestsubarrayWithgivensumk(arr, k);
        System.out.println(len);
    }
}