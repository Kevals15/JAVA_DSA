package Array.Medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    // Brute Force Approach
    public static boolean linearsearch(int el, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                return true;
            }
        }
        return false;
    }

    // Brute Force;
    public static int BrutelongestConsecutive(int[] arr) {
        int longest = 0;

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 1;
            while (linearsearch(x + 1, arr) == true) {
                x = x + 1;
                count++;
            }
            longest = Math.max(count, longest);
        }
        return longest;
    }

    // 1 2 3 4 100 200
    public static int BetterlongestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int lastVisit = Integer.MIN_VALUE;
        int longest = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (lastVisit == arr[i] - 1) {
                count++;
                lastVisit = arr[i];

            } else if (lastVisit != arr[i]) {
                count = 1;
                lastVisit = arr[i];
            }
            longest = Math.max(count, longest);
        }
        return longest;
    }

    // Optimal approach;
    public static int OptimallongestConsecutive(int[] arr) {
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int el : set) {
            if (!set.contains(el - 1)) {
                int count = 1;
                int x = el;
                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2, 5, 101 };
        System.out.println(OptimallongestConsecutive(nums)); // Output: 5
    }
}
