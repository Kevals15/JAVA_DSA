package Array.Medium;

import java.util.HashMap;
import java.util.Map;

// Array element which can appear more than n/2 times
public class MajorityElementInArray {

    // Brute Force
    public static int majorityelem(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }
            if (cnt > n / 2)
                return arr[i];
        }

        return -1;
    }

    // Better Approach
    public static int majorityelemBetter(int[] arr) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], val + 1);
        }

        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > arr.length / 2) {
                return it.getKey();
            }
        }

        return -1;
    }

    public static int majorityelemOptimal(int[] arr) {
        int cnt = 0;
        int el = 0;

        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (el == arr[i]) {
                cnt1++;
            }
        }

        if (cnt1 > arr.length / 2) {
            return el;
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 4, 3, 1, 1, 1, 1 };
        int ans = majorityelemBetter(arr);
        System.out.println(ans);
    }
}
