package String.easy;

// Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.
public class FaultyKeyboard {
    public static void main(String[] args) {
        String s = "poiinter";
        System.out.println(finalString(s)); // Output: "ponter"
    }

    public static String finalString(String s) {
        char[] str = s.toCharArray();
        int left = 0, right = 0;
        while (right < str.length) {
            if (str[right] != 'i') {
                right++;
            } else if (str[right] == 'i') {
                reverse(left, right, str);
                right++;
            }
        }
        String res = "";
        for (char c : str) {
            if (c != 'i') {
                res += c;
            }
        }
        return res;
    }

    public static void reverse(int left, int right, char[] str) {
        while (left <= right) {
            swap(left, right, str);
            left++;
            right--;
        }
    }

    public static void swap(int left, int right, char[] str) {
        char temp = str[left];
        str[left] = str[right];
        str[right] = temp;
    }
}
