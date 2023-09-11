/*Delete middle element of a stack
https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
*/
package Stack_Queue;

import java.util.*;

public class Delete_Miiddle_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //testcase
        int t = sc.nextInt();

        while (t-- > 0) {
            int sizeOfStack = sc.nextInt();
            Stack<Integer> myStack = new Stack<>();

            //adding elements to the stack
            for (int i = 0; i < sizeOfStack; i++) {
                int x = sc.nextInt();
                myStack.push(x);
            }
            Solution obj = new Solution();
            obj.deleteMid(myStack, sizeOfStack);

            while (!myStack.isEmpty()) {
                System.out.print(myStack.peek() + " ");
                myStack.pop();
            }
            System.out.println();
        }
    }
}

class Solution {
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here
        int mid = (int) Math.ceil((double) (sizeOfStack + 1) / 2);
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < mid - 1; i++) {
            v.add(s.pop()); //5 4
        }
        s.pop(); //3
        while (!v.isEmpty())
        {
            s.push(v.remove(v.size() -1));
        }
    }
}