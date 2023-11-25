/*1859. Sorting the Sentence
https://leetcode.com/problems/sorting-the-sentence/description/*/
package String;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

    }
    static String sortSentence(String s) {
        Map<Integer, String> indexWordMap = new HashMap<>();

        // Split the input sentence into words
        String[] words = s.split(" ");

        // Extract the position numbers and store them along with the words in the map
        for (String word : words) {
            int lastIndex = word.length() - 1;
            int position = Character.getNumericValue(word.charAt(lastIndex));
            String actualWord = word.substring(0, lastIndex);
            indexWordMap.put(position, actualWord);
        }

        // Sort the map based on the position numbers
        TreeMap<Integer, String> sortedMap = new TreeMap<>(indexWordMap);

        // Reconstruct the original sentence
        StringBuilder sBd = new StringBuilder();
        for (String word : sortedMap.values()) {
            sBd.append(word);
            sBd.append(" ");
        }

        return sBd.toString().trim();
    }
}
/*static String sortSentence(String s) {
    Map<Integer, String> indexWordMap = new HashMap<>();

    // Split the input sentence into words
    String[] words = s.split(" ");

    // Extract the position numbers and store them along with the words in the map
    for (String word : words) {
        int lastIndex = word.length() - 1;
        int position = Character.getNumericValue(word.charAt(lastIndex));
        String actualWord = word.substring(0, lastIndex);
        indexWordMap.put(position, actualWord);
    }

    // Sort the map based on the position numbers
    TreeMap<Integer, String> sortedMap = new TreeMap<>(indexWordMap);

    // Reconstruct the original sentence
    StringBuilder sBd = new StringBuilder();
    for (String word : sortedMap.values()) {
        sBd.append(word);
        sBd.append(" ");
    }

    return sBd.toString().trim();
}
*/