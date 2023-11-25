/*1704. Determine if string halves are alike
https://leetcode.com/problems/determine-if-string-halves-are-alike/*/
package String;

public class stringHalvesAlike {
    public static void main(String[] args) {
        String s = "Uo";
        //halvesAreAlike(s);
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < s.length()/2; i++) {
            s1.append(s.charAt(i));
        }

        for (int i = s.length()/2; i < s.length(); i++) {
            s2.append(s.charAt(i));
        }

        int vowel1 = countVowel(String.valueOf(s1));
        int vowel2 = countVowel(String.valueOf(s2));
        if(vowel1 == vowel2){
            return true;
        }
        return false;
    }
    static int countVowel(String s){
        int vowel=0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'||
                    s.charAt(i) == 'A' ||s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                vowel++;
            }
        }
        return vowel;
    }
}
/*class Solution {
    public boolean halvesAreAlike(String s) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < s.length()/2; i++) {
            s1.append(s.charAt(i));
            s2.append(s.charAt(i + s.length()/2));
        }

        int vowel1 = countVowel(String.valueOf(s1));
        int vowel2 = countVowel(String.valueOf(s2));

        return vowel1 == vowel2;
    }

    static int countVowel(String s) {
        int vowel = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            }
        }
        return vowel;
    }

*/