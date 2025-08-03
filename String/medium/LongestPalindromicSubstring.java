package String.medium;

public class LongestPalindromicSubstring {

    public static String LongestPalindrome(String s) {
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int odd = findOddEven(s, i, i);       // Odd length palindromes
            int even = findOddEven(s, i, i + 1);  // Even length palindromes
            int max = Math.max(odd, even);

            // 🛠 FIX: Wrap this whole logic in braces
            if (max > end - start) {
                start = i - ((max - 1) / 2);
                end = i + (max / 2);
            }
        }

        return s.substring(start, end + 1);
    }

    public static int findOddEven(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Total length of palindrome
    }

    public static void main(String[] args) {
        String ans = LongestPalindrome("babad");
        System.out.println(ans);  // Output: "ababa"
    }
}
