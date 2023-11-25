/*13. Roman to Integer
https://leetcode.com/problems/roman-to-integer/*/
package String;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    static int romanToInt(String s) {
        HashMap<Character, Integer> hM = new HashMap<>();

        hM.put('I', 1);
        hM.put('V', 5);
        hM.put('X', 10);
        hM.put('L', 50);
        hM.put('C', 100);
        hM.put('D', 500);
        hM.put('M', 1000);

        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = hM.get(s.charAt(i));
            int b = (i + 1 < s.length()) ? hM.get(s.charAt(i + 1)) : 0;

            if (a < b) {
                value -= a;
            } else {
                value += a;
            }
        }

        return value;
    }
}

