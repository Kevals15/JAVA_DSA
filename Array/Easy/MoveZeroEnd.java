import java.util.Arrays;

// Bruteforce Approach
// sc = o(N)
// tc = nlogn + o(n)
// public class MoveZeroEnd {

//     public static void MoveZeroend(int[] arr) {
//         int[] temp = new int[arr.length];
//         int idx = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 temp[idx++] = arr[i];
//             }
//         }

//         for (int i = 0; i < temp.length; i++) {
//             arr[i] = temp[i];
//         }

//         for (int i = temp.length; i < arr.length; i++) {
//             arr[i] = 0;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 0, 2, 0, 3, 4, 5, 0, 0, 3, 0 };
//         MoveZeroend(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// Optimal Approach
public class MoveZeroEnd {

    public static void MoveZeroend(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        System.out.println(j);

        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 4, 5, 0, 0, 3, 0 };
        MoveZeroend(arr);
        System.out.println(Arrays.toString(arr));
    }
}