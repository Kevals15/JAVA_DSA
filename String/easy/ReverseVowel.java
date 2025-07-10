package String.easy;

import java.util.HashMap;

public class ReverseVowel {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s)); // Output: "holle"
    }

    public static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int left = 0, right = str.length - 1;
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('A', 1);
        mp.put('E', 2);
        mp.put('I', 3);
        mp.put('O', 4);
        mp.put('U', 5);
        mp.put('a', 1);
        mp.put('e', 2);
        mp.put('i', 3);
        mp.put('o', 4);
        mp.put('u', 5);

        while (left <= right) {
            while ((left < right) && (!mp.containsKey(str[left]))) {
                left++;
            }
            while ((right > left) && (!mp.containsKey(str[right]))) {
                right--;
            }
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        return new String(str);
    }

    // We can also check if a character is a vowel using a simple method
    // This method is not used in the main solution but can be useful in other
    // contexts.
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
