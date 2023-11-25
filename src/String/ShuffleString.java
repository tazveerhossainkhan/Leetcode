/*1528. Shuffle String
https://leetcode.com/problems/shuffle-string/*/
package String;

public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        str = restoreString(str,indices);
        System.out.println(str);
    }
    static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }

    /*static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<indices.length;i++){
            //sb.append(s.charAt(indices[i]));
            sb.setCharAt(indices[i],s.charAt(i));
        }
        s = String.valueOf(sb);
        return s;
    }*/
}
