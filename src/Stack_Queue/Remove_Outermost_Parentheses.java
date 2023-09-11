/*1021. Remove Outermost Parentheses
https://leetcode.com/problems/remove-outermost-parentheses/*/

package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(') {
                if (!stack.isEmpty()) {
                    result.append(current);
                }
                stack.push(current);
            } else if (current == ')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    result.append(current);
                }
            }
        }

        return result.toString();
    }

    /*static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String[] ans = new String[s.length()];
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(i)=='(')
                {
                    ans[j] = Character.toString(s.charAt(i));
                    stack.push('(');
                    
                } else if (s.charAt(i)==')') {
                    ans[j] = Character.toString(s.charAt(i));
                    stack.pop();

                } else if (stack.isEmpty()) {
                    break;
                }
            }
            System.out.println(Arrays.toString(ans)+ "  " + i );
        }

        //System.out.println(Arrays.toString(ans));
        return "a";
    }*/
}
