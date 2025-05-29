public class RotateByOneplace {

    public int[] rotatearray(int[] arr) {
        int temp = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        RotateByOneplace ro = new RotateByOneplace();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        ro.rotatearray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
