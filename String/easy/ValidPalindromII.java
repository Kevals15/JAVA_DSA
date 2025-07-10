package String.easy;

// Given a string s, return true if the s can be palindrome after deleting at most one character from it.

public class ValidPalindromII {
    public static void main(String[] args) {
        String s = "abcdcba";
        System.out.println(validPalindrome(s)); // Output: true
    }

     public static boolean validPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<=right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return isPalindrome(left+1,right,s) || isPalindrome(left,right-1,s);
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindrome(int left,int right,String s)
    {
        while(left<=right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            else
            {
                left++;
                right--;
            }
        }
        return true;
    } 
}
