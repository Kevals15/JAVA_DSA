//better solution 

// public class SecondlargestSecondSmallest {

//     public void smalllarge(int[] arr) {
//         int large = arr[0];
//         int small = arr[0];
//         int secondlarge = arr[0];
//         int secondsmall = arr[0];
//         int n = arr.length;

//         for (int i = 0; i < n; i++) {
//             large = Math.max(large, arr[i]);
//             small = Math.min(small, arr[i]);
//         }

//         for (int i = 0; i < n; i++) {
//             if (arr[i] > secondlarge && arr[i] != large) {
//                 secondlarge = arr[i];
//             }
//             if (arr[i] < secondsmall && arr[i] != small) {
//                 secondsmall = arr[i];
//             }
//         }
//         System.out.println("Second largest " + secondlarge);
//         System.out.println("Second smallest " + secondsmall);
//     }

//     public static void main(String[] args) {
//         SecondlargestSecondSmallest ss = new SecondlargestSecondSmallest();
//         int[] arr = { 13, 4, 90, 11, 23, 4, 45 };
//         ss.smalllarge(arr);
//     }
// }

//optimal solution
public class SecondlargestSecondSmallest {

    public int secondlarge(int[] arr) {
        int n = arr.length;
        int large = arr[0];
        int slarge = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                slarge = large;
                large = arr[i];
            } else if (arr[i] < large && arr[i] > slarge) {
                slarge = arr[i];
            }
        }
        return slarge;
    }

    public int secondsmall(int[] arr) {
        int n = arr.length;
        int small = arr[0];
        int ssmall = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                ssmall = small;
                small = arr[i];
            } else if (arr[i] < ssmall && arr[i] != small) {
                ssmall = arr[i];
            }
        }
        return ssmall;
    }

    public static void main(String[] args) {
        SecondlargestSecondSmallest ss = new SecondlargestSecondSmallest();
        int[] arr = { 13, 4, 90, 11, 23, 4, 45 };
        int secondlarge = ss.secondlarge(arr);
        int secondsmall = ss.secondsmall(arr);
        System.out.println(secondlarge + " " + secondsmall);
    }
}