/*1047. Remove All Adjacent Duplicates In String
https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/*//*

package Stack_Queue;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    static String removeDuplicates(String s) {
        String ans = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        char a, b, c;
        while (!stack.isEmpty()) {
            a = stack.peek();
            b = stack.pop();
            if (!stack.isEmpty()) {
                c = stack.peek();
                if (a != c) {
                    ans = String.valueOf(a) + ans;
                } else {
                    stack.pop();
                }
            }
        }
        return ans;
    }
}
*/

package Stack_Queue;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("azxxzy"));
    }

    static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}
