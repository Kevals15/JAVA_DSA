public class Max {

    public int findmax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 4, 90, 11, 23, 4, 45 };
        Max m = new Max();
        int maximum = m.findmax(arr);
        System.out.println(maximum);
    }
}