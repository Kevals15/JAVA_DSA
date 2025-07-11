package String.easy;

import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        
    }

    // public static boolean isAnagram(String s, String t) {
    //     if(s.length()!=t.length()) return false;
    //     HashMap<Character,Integer> map = new HashMap<>();
    //     for(int i=0;i<s.length();i++)
    //     {
    //         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    //     }
    //     for(int i=0;i<t.length();i++)
    //     {
    //         map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
    //     }
    //     for(Map.Entry<Character,Integer> set : map.entrySet())
    //     {
    //         if(set.getValue()!=0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }



    //second approach
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // Assuming only lowercase letters a-z

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
