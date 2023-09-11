/*1346. Check If N and Its Double Exist
https://leetcode.com/problems/check-if-n-and-its-double-exist/ */
package Searching;

import java.util.Arrays;

public class Double_Exist {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(arr));

    }

   /* static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[i] != 0) {
                    if (arr[mid] < arr[i] * 2) {
                        start = mid + 1;
                    } else if (arr[mid] > arr[i] * 2) {
                        end = mid - 1;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }*/


    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            //int start = i;
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;  //mid=1
                //     0 1 2 3
                //arr={2,3,5,10}

                    if (arr[mid] < arr[i] * 2 ) //arr[mid] = 3<4 ;i=0,
                    {
                        start = mid + 1;
                    } else if (arr[mid] > arr[i] * 2 ) {
                        end = mid - 1;
                    } else {

                        return true;
                    }

                //break;
            }
        }
        return false;
    }
}
