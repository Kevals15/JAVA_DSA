package String.easy;

public class FirstPalindromeString {
    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(firstPalindrome(words)); // Output: "ada"
    }

    public static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(isPalindrome(words[i]))
            {
                return words[i];
            }
        }
        return "";
    }

    public static boolean isPalindrome(String words)
    {
        int n = words.length();
        int left = 0,right = n-1;
        while(left<=right)
        {
            if(words.charAt(left)!=words.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
