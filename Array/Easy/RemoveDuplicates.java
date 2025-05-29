
// Brute force solution with o(n) space complexity
// import java.util.HashSet;

// public class RemoveDuplicates {

//     public int removeduplicates(int[] arr) {
//         HashSet<Integer> hs = new HashSet<>();
//         for (int i = 0; i < arr.length; i++) {
//             hs.add(arr[i]);
//         }
//         return hs.size();
//     }

//     public static void main(String[] args) {
//         RemoveDuplicates rd = new RemoveDuplicates();
//         int[] arr = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3 };
//         int num = rd.removeduplicates(arr);
//         System.out.println(num);
//     }
// }

// Optimal approach with o(n) + o(1) space complexity
public class RemoveDuplicates {

    public int removeduplicates(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return (i + 1);
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] arr = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3 };
        int num = rd.removeduplicates(arr);
        System.out.println(num);
    }
}