package Stack;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public static String RemoveAdjacent(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (st.size() > 0 && st.peek() == arr[i]) {
                st.pop();
            } else {
                st.push(arr[i]);
            }
        }
        String str = "";
        for (char i : st) {
            str += i;
        }
        return str;
    }

    public static void main(String[] args) {
        String s = RemoveAdjacent("abbaca");
        System.out.println(s);
    }
}
