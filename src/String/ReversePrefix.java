/*2000.Reverse Prefix of Word
https://leetcode.com/problems/reverse-prefix-of-word/*/
package String;

public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    static String reversePrefix(String word, char ch) {
        int a = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                a = i;
                break;
            }
        }
        if (a == -1) {
            return word;
        }

        StringBuilder reversedWord = new StringBuilder(word.length());

        for (int i = a; i >= 0; i--) {
            reversedWord.append(word.charAt(i));

        }
        for (int i = a + 1; i < word.length(); i++) {
            reversedWord.append(word.charAt(i));
        }

        String result = reversedWord.toString();

        return result;

    }
}
