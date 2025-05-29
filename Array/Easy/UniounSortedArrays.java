import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//  Brute force approach 
//  tc = o(n1+n2)
public class UniounSortedArrays {

    // public static Set<Integer> unioun(int[] A, int[] B) {
    // HashSet<Integer> hs = new HashSet<>();
    // for (int i = 0; i < A.length; i++) {
    // hs.add(A[i]);
    // }
    // for (int j = 0; j < B.length; j++) {
    // hs.add(B[j]);
    // }
    // return hs;
    // }

    public static ArrayList<Integer> union(int[] A, int[] B) {
        ArrayList<Integer> ls = new ArrayList<>();
        int n1 = A.length;
        int n2 = B.length;
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (A[i] <= B[j]) {
                if (ls.size() == 0 || ls.get(ls.size() - 1) != A[i]) {
                    ls.add(A[i]);
                }
                i++;
            } else {
                if (ls.size() == 0 || ls.get(ls.size() - 1) != B[j]) {
                    ls.add(B[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (ls.get(ls.size() - 1) != A[i]) {
                ls.add(A[i]);
            }
            i++;
        }
        while (j < n2) {
            if (ls.get(ls.size() - 1) != B[j]) {
                ls.add(B[j]);
            }
            j++;
        }
        System.out.println(ls);
        return ls;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 2, 2, 4, 5, 5, 6, 7, 7 };
        System.out.println(union(arr, arr2));
    }
}
