/*https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/*/
package String;

public class Check_ifTwoStringsAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String result1 = String.join("", word1);
        String result2 = String.join("", word2);
        if(result1.equals(result2)){
            return true;
        }else {
            return false;
        }
    }
}
