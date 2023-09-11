/*888. Fair Candy Swap
        https://leetcode.com/problems/fair-candy-swap/*/

package Searching;

import java.util.Arrays;

public class Fair_Candy_Swap {
    public static void main(String[] args) {
        int[] aliceSizes = {2};
        int[] bobSizes = {1, 3};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes)
    {
        int start=0,end=0;
        for(int i=0;i< aliceSizes.length;i++)
        {
            start = start + aliceSizes[i];
        }

        for(int i=0;i< bobSizes.length;i++)
        {
            end = end + bobSizes[i];
        }
        int mid = start + (end-start)/2 ;
        int diffAllice = mid - start; //1
        int[] ret = {-1,-1};
        for(int i=0;i<aliceSizes.length;i++)
        {
            int exchange = diffAllice + aliceSizes[i];
            for(int j=0;j<bobSizes.length;j++)
            {
                if(exchange == bobSizes[j])
                {
                    int[] swap ={aliceSizes[i],bobSizes[j]};
                    return swap;
                }
            }
        }
        return ret;
    }
}
