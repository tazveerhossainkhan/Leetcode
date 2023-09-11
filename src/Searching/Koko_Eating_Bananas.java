/*
875. Koko Eating Bananas
        https://leetcode.com/problems/koko-eating-bananas/
*/

package Searching;

import java.util.Arrays;

public class Koko_Eating_Bananas {
    public static void main(String[] args) {
        int[] piles = {805306368, 805306368, 805306368};
        int h = 1000000000;
        System.out.println(minEatingSpeed(piles, h));
    }

    static int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
for (int i = 1; i < piles.length; i++) {
    if (piles[i] > max) {
        max = piles[i];
    }
}
        int start = 1;
        int end = max;
        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long hours = 0;

            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
            }

            if (hours <= h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}




/*package Searching;

import java.util.Arrays;

public class Koko_Eating_Bananas {
    public static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;
        System.out.println(minEatingSpeed(piles, h));
    }

    static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        int[] k = new int[max];
        for (int i = 0; i < max; i++) {
            k[i] = i + 1;
        }

        int start = 1;
        int end = max;
        int ans = end;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours = hours + (int) Math.ceil((double) (piles[i] / mid));
                //(int) Math.ceil((double) piles[i] / mid)
                System.out.println(i + " " + hours);
            }
            if (hours <= h) {
                ans = Math.min(ans, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }
}*/



/*static boolean canEat(int[] piles,int h,int can_eat)
    {
        double ate = 0;

            for(int j=0;j<piles.length;j++)
            {
                ate = ate+piles[j]%can_eat;
                ate=Math.ceil(ate);
            }
            if(ate>h)
            {
                return false;
            }
        System.out.println("true");
        return true;
    }*/

/*while (start<=end)
        {
            int mid = start+(end-start)/2;
            ans = mid;
            if((mid*h) >=sum)
            {
                if(canEat(piles, h, mid))
                {
                    ans = mid;
                }
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
            return ans;
        }*/
