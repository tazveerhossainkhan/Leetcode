package Stack_Queue;

/*
package Stack_Queue;

import java.util.Stack;

*/
/*public class Stack_With_Increment_Operation {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public Stack_With_Increment_Operation() {
        this(DEFAULT_SIZE);
    }

    public Stack_With_Increment_Operation(int size) {
        this.data = new int[size];
    }
}*//*


class CustomStack {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomStack(int maxSize) {
        this.data = new int[maxSize];
    }

    public void push(int x) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        data[end] = x;
        end++;
    }

    //mein
    public boolean isFull() {
        return end == data.length;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;

        return removed;
    }

    public void increment(int k, int val) throws Exception {
        int a = end;
        while (k < 0) {
            if (isFull()) {
                throw new Exception("Stack is full");
            }
            data[a] = data[a] + val;
            a--;
            k--;
        }
    }

    //mein
    public boolean isEmpty() {
        return end == 0;
    }
}
*/
class CustomStack {
    int[] data;
    int ptr = 0;
    int max;

    public CustomStack(int maxSize) {
        this.data = new int[maxSize];
        this.max = maxSize;
    }

    public void push(int x) {
        if (ptr == data.length) return;
        data[ptr++] = x;
    }

    public int pop() {
        if (ptr == 0) {
            return -1;
        }
        return data[--ptr];
    }

    public void increment(int k, int val) {
        if (k > ptr) {
            for (int i = 0; i < max; i++) {
                data[i] = data[i] + val;
            }
        } else {
            for (int i = 0; i < k; i++) {
                data[i] = data[i] + val;
            }
        }
    }
}

