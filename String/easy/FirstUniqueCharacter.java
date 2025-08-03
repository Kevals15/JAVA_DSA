package String.easy;

public class FirstUniqueCharacter {

    public static int FirstUnique(String s) {
        char[] freq = new char[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int ans = FirstUnique("leetcode");
        System.out.println(ans);
    }
}
