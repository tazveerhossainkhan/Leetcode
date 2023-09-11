/*921. Minimum Add to Make Parentheses Valid
https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/*/

package Stack_Queue;

import java.util.Stack;

public class Minimum_Add_2_Make_Parentheses_Valid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid(")))"));
    }
    static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray())
        {
            if(ch=='(')
            {
                stack.push(ch);
            }else
            {
                if(!stack.isEmpty() && stack.peek() == '(')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}
