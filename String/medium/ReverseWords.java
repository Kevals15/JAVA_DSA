package String.medium;

public class ReverseWords {
    public static void main(String[] args) {
        String s ="a good   example";
        System.out.println(reverseWords(s)); // Output: "example good a"
    }

    public static String reverseWords(String s) {
        String res = "";
        String[] words = s.strip().split("\\s+");
        for(int i=words.length-1;i>=0;i--)
        {
            words[i].strip();
            res+=words[i]+" ";
        }
        return res.strip();

    }
}
