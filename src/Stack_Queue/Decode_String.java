/*394. Decode String
https://leetcode.com/problems/decode-string/*/
package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class Decode_String {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }

    static public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder subStr = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                stack.push(s.charAt(i));
            } else {
                while (!stack.isEmpty() && stack.peek() != '[') {
                    subStr.insert(0, stack.pop());
                }
                stack.pop();

                StringBuilder digitString = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    digitString.insert(0, stack.pop());
                }
                int repetitionCount = Integer.parseInt(digitString.toString());

                for (int j = 0; j < repetitionCount; j++) {
                    for (int k = 0; k < subStr.length(); k++) {
                        stack.push(subStr.charAt(k));
                    }
                }
                subStr.setLength(0);
            }
        }
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }

    /*static public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = new char[100];
        int size = s.length();
        for (int i = 0; i < size; i++) {
            stack.push(s.charAt(i));
        }
        *//*System.out.println(stack.pop());
        System.out.println(stack);*//*
     *//*while (stack.peek()!='[')
        {
            if(stack.peek()!=']')
            {
                charArray = Arrays.copyOf(charArray,charArray.length+1);
                charArray[charArray.length-1] = stack.pop();
            }
            else
            {
                stack.pop();
            }
        }
        System.out.println(charArray);*//*
        int index = 0;
        while (!stack.isEmpty()) {
            while (stack.peek() != '[') {
                if (stack.peek() != ']') {
                    if (index >= charArray.length) {
                        charArray = Arrays.copyOf(charArray, charArray.length + 1);
                    }
                    charArray[index] = stack.pop();
                    index++;
                } else {
                    stack.pop();
                }
            }
        }
// Print the modified charArray
        for (int i = 0; i < index; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
        return s;
    }*/
}
