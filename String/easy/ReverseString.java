package String.easy;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s); // Output: "olleh"
    }

    public static void reverseString(char[] s) {
        int n = s.length;
        int left = 0,right = n-1;
        while(left<=right)
        {
            swap(left,right,s);
            left++;
            right--;
        }
    }

    public static void swap(int left,int right,char[] s)
    {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
