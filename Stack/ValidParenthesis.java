package Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValidParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                st.push(arr[i]);
            } else {
                if (st.pop() != map.get(arr[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "(){[}]";
        boolean ans = isValidParenthesis(s);
        System.out.println(ans);
    }
}
