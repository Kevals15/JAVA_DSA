import java.util.ArrayList;

public class InterSectionArrays {

    // ✅Brute Force with
    // tc = o(n1xn2)
    // sc = o(n2)

    // public static ArrayList<Integer> intersection(int[] A, int[] B) {
    // int[] visited = new int[B.length];
    // ArrayList<Integer> ls = new ArrayList<>();
    // for (int i = 0; i < A.length; i++) {
    // for (int j = 0; j < B.length; j++) {
    // if (A[i] == B[j] && visited[j] == 0) {
    // ls.add(B[j]);
    // visited[j] = 1;
    // break;
    // }
    // }
    // }
    // return ls;
    // }

    public static ArrayList<Integer> intersection(int[] A, int[] B) {
        ArrayList<Integer> ls = new ArrayList<>();
        int n1 = A.length;
        int n2 = B.length;
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (A[i] < B[j]) {
                i++;
            } else if (B[j] < A[i]) {
                j++;
            } else {
                ls.add(A[i]);
                i++;
                j++;
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 2, 2, 4, 5, 5, 6, 7, 7 };
        System.out.println(intersection(arr, arr2));

    }
}
