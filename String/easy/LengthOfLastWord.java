package String.easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s)); // Output: 5
    }

    public static int lengthOfLastWord(String s) {
        int len = 0;
        s.strip();
        String[] words = s.split(" ");
        len = words[words.length-1].length();
        return len;

    }
}
