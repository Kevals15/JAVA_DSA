package String.easy;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s)); // Output: "j-Ih-gfE-dCba"
    }

    public static String reverseOnlyLetters(String s) {
        char[] str = s.toCharArray();
        int left = 0,right = str.length-1;
        while(left<=right)
        {
            if(!Character.isLetter(str[left]))
            {
                left++;
            }
            else if(!Character.isLetter(str[right]))
            {
                right--;
            }
            else
            {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
        return new String(str);
    }
}
