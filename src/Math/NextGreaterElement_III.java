package Math;

import java.util.ArrayList;
import java.util.Collections;

public class NextGreaterElement_III {
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(12));
    }

    static int nextGreaterElement(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        int temp = n;
        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }
        Collections.reverse(digits);

        int i = digits.size() - 2;
        while (i >= 0 && digits.get(i) >= digits.get(i + 1)) {
            i--;
        }

        if (i == -1) {
            return -1;
        }

        int j = digits.size() - 1;
        while (digits.get(j) <= digits.get(i)) {
            j--;
        }
        Collections.swap(digits, i, j);

        Collections.sort(digits.subList(i + 1, digits.size()));

        long result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }

        if (result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE && result > n) {
            return (int) result;
        } else {
            return -1;
        }
    }
}
