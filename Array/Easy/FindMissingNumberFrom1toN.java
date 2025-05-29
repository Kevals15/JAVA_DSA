public class FindMissingNumberFrom1toN {

    // ✅Brute force approach
    // tc = o(nxn)
    // public static int findmissingnumber(int[] arr, int n) {
    // for (int i = 1; i < n - 1; i++) {
    // int flag = 0;
    // for (int j = 0; j < n - 1; j++) {
    // if (i == arr[j]) {
    // flag = 1;
    // break;
    // }
    // }
    // if (flag == 0)
    // return i;
    // }
    // return -1;
    // }

    // ✅Better Approach
    // tc = o(N+N)
    // sc = o(N)
    // public static int findmissingnumber(int[] arr, int n) {
    // int[] hash = new int[n + 1];
    // for (int i = 0; i < n - 1; i++) {
    // hash[arr[i]]++;
    // }
    // for (int i = 1; i < hash.length; i++) {
    // if (hash[i] == 0) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // ✅Optimal Approach
    // TC = O(N)
    // SC = O(1)
    public static int findmissingnumber(int[] arr, int n) {
        int sum = (n * (n + 1)) / 2;
        int s2 = 0;
        for (int i = 0; i < arr.length; i++) {
            s2 += arr[i];
        }
        return sum - s2;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int n = 5;
        System.out.println(findmissingnumber(arr, n));
    }
}