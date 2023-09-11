/*496. Next Greater Element I
https://leetcode.com/problems/next-greater-element-i/*/
package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class Greater_Element_I {
    public static void main(String[] args) {
        int[] num1 = {2, 4};
        int[] num2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nextGreaterElement(num1, num2)));
    }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int cur,idx = 0;
        for (int i = 0; i < res.length; i++) {
            res[i] = -1;
        }

        for (int i = 0; i < nums1.length; i++) {
            cur = nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j]==cur)
                {
                    idx=j;
                    break;
                }
            }
            for(int j=idx;j<nums2.length;j++)
            {
                if(nums2[j]>cur)
                {
                    res[i]= nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}
/*int[] ans = new int[nums1.length];
        int index=0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j])
                {
                    int k = 0;
                    for(k= j+1; k< nums2.length; k++)
                    {
                        if(nums2[k]>nums1[i])
                        {
                            ans[index]= nums2[k+1];
                            index++;
                            break;
                        }
                    }
                }
            }
        }
        return ans;*/

//----------------------------------------------------------------------------
/*for (int i = 0; i < nums2.length; i++) {
            cur = nums2[i];
            while (!stack.isEmpty() && cur > stack.peek()) {
                val = stack.pop();
                for (int j = 0; j < nums1.length; j++) {
                    if (nums1[j] == val) {
                        idx = j;
                        break;
                    }
                }
                res[idx] = val;
            }
            for(int k=0;k<nums1.length;k++)
            {
                if(cur==nums1[k])
                {
                    stack.add(cur);
                }
            }
        }*/

//{4, 1, 2}
//{1, 3, 4, 2}
//Stack<Integer> stack = new Stack<>();