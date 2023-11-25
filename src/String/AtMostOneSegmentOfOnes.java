/*1784. Check if Binary String Has at Most One Segment of Ones
https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/*/
package String;

public class AtMostOneSegmentOfOnes {
    public static void main(String[] args) {
        String str = "1001";
        System.out.println(checkOnesSegment(str));
    }
    static boolean checkOnesSegment(String s) {
        int count=0;
        int pos=0;
        while(s.charAt(pos)!='1'){
            pos++;
            if(pos==s.length()){
                return true;
            }
        }

        for(int i=pos;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count++;
            }
            else if(count>0&&s.charAt(i)=='1'){
                return false;
            }
        }
        return true;
    }
}
/*class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
       int pos=0;
       while(s.charAt(pos)!='1'){
              pos++;
            if(pos==s.length()){
                return true;
            }
          }

       for(int i=pos;i<s.length();i++){
          if(s.charAt(i)=='0'){
              count++;
          }
          else if(count>0&&s.charAt(i)=='1'){
              return false;
          }
       }
       return true;
    }
}*/