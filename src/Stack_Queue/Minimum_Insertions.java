/*1541. Minimum Insertions to Balance a Parentheses String
https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/*/
package Stack_Queue;

import java.util.Stack;

public class Minimum_Insertions {
    public static void main(String[] args) {
        System.out.println(minInsertions("()))"));
    }
    static int minInsertions(String s) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
// -Keep adding left barckets
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else{
                if(i+1<s.length()&& s.charAt(i+1)==')'){
                    // -Skip it as two consecutives are present
                    i++;
                }else count++;

                if(!stack.isEmpty()){
                    stack.pop();
                }else count++ ;
            }
        }
        count+=2*stack.size();
        return count;

    }
}
/*for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (s[stack.size() + 1] == ')')
                if (c == ')') {
                    if (stack.isEmpty()) {
                        insertions++;
                    } else {
                        stack.pop();
                    }
                    if (stack.isEmpty()) {
                        insertions++;
                    }
                }
        }
        insertions += stack.size() * 2;
        return insertions;*/