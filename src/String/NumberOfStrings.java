/*1967. Number of Strings That Appear as Substrings in Word\
https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/*/
package String;

public class NumberOfStrings {
    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns,word));
    }
    static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String a: patterns){
            if(word.contains(a)){
                count++;
            }
        }
        return count;
    }
}
