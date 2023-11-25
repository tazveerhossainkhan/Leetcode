/*709. To Lower Case
https://leetcode.com/problems/to-lower-case/description/*/
package String;

import java.util.Locale;

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(toLowerCase(s));
    }
    static String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
