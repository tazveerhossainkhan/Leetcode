/*Reverse First K elements of Queue
https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1*/

package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Reverse_First_K_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // Taking count of total number of elements
            int n = sc.nextInt();

            // Taking count of total elements
            // that need to be reversed
            int k = sc.nextInt();

            // Creating a Queue
            Queue<Integer> q = new LinkedList<>();

            // adding all the elements to the Queue
            while (n-- > 0) {
                q.add((int) sc.nextInt());
            }

            // Creating an object of class GfG
            GfG g = new GfG();

            // calling modifyQueue of class GfG
            // and passing Queue and k as arguments
            // and storing the reuslt in a new Queue
            Queue<Integer> ans = g.modifyQueue(q, k);

            // Printing all the elements from the
            // new Queue and polling them out
            while (!ans.isEmpty()) {
                int a = ans.peek();
                ans.poll();
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack1.push(q.poll());

        }

        while(!q.isEmpty())
        {
            stack2.push(q.poll());
        }

        while(!stack1.isEmpty())
        {
            q.add(stack1.pop());
        }
        while(!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
        while(!stack1.isEmpty())
        {
            q.add(stack1.pop());
        }
        /*int i=0;
        while(i<k)
        {
            stack1.push(q.remove())
            i++;
        }*/
        return q;
    }
}
