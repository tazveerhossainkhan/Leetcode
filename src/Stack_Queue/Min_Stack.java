package Stack_Queue;

public class Min_Stack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.pop();
        minStack.top();

    }

    static class MinStack {
        int[] data = new int[30];
        int ptr = -1;

        public MinStack() {

        }

        public void push(int val) {
            ptr++;
            data[ptr] = val;
            System.out.println(data[ptr]);
        }

        public void pop() {

            int removed = data[ptr];
            ptr--;
            System.out.println(removed);
        }

        public int top() {
            return data[ptr];
        }

        public int getMin() {
            return 0;
        }
    }
}
