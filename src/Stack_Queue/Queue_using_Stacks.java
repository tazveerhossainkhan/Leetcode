/*232. Implement Queue using Stacks
        https://leetcode.com/problems/implement-queue-using-stacks/*/
package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Queue_using_Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.peek());
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
    }
}

class QueueUsingStack {
    private Stack<Integer> driver;
    private Stack<Integer> helper;

    public QueueUsingStack() {
        driver = new Stack<>();
        helper = new Stack<>();

    }

    public void add(int item) {
        driver.push(item);
    }
    public int remove()
    {
        while(!driver.isEmpty())
        {
            helper.push(driver.pop());
        }
        int removed = helper.pop();

        while (!helper.isEmpty())
        {
            driver.push(helper.pop());
        }
        return removed;
    }
    public int peek()
    {
        while(!driver.isEmpty())
        {
            helper.push(driver.pop());
        }
        int peeked = helper.peek();
        while (!helper.isEmpty())
        {
            driver.push(helper.pop());
        }
         return peeked;
    }
    public boolean isEmpty()
    {
        return driver.isEmpty();
    }
}

