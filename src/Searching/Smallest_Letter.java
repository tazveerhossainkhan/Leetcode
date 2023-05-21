                    /*
                    744. Find Smallest Letter Greater Than Target
                    https://leetcode.com/problems/find-smallest-letter-greater-than-target
                    */

package Searching;

public class Smallest_Letter {
    public static void main(String[] args) {
        char[] letters={'x','x','y','y'};
        char target = 'z';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int s=0, e= letters.length - 1;
        while (s<=e)
        {
            int mid = s + (e-s)/2 ;
            if(letters[mid]<=target)
            {
                s = mid+1;
            }
            else
            {
                e = mid-1;
            }
        }
        return letters[s%letters.length];
    }
}
