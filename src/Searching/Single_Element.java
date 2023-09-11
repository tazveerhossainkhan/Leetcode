/*        540. Single Element in a Sorted Array
                https://leetcode.com/problems/single-element-in-a-sorted-array/*/

package Searching;

public class Single_Element {
    public static void main(String[] args) {
        int[] arr=new int[1000];
        arr= new int[]{3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr));

    }
    static int singleNonDuplicate(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] != arr[start + 1]) {
            return arr[start];
        }
        if (arr[end] != arr[end - 1]) {
            return arr[end];
        }
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
            {
                return arr[mid];
            }
            else
            {
                if (arr[mid] == arr[mid - 1]) {
                    if ((mid - start + 1) % 2 == 1) {
                        end = mid - 2;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if ((end - mid + 1) % 2 == 1) {
                        start = mid + 2;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
          return -1;
    }
}
//Index -1 out of bounds for length 7
 ///Bruteforce Approach
/*static int singleNonDuplicate(int[] arr)
    {
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            if(arr[i]==arr[i+1])
            {
                i++;
            }
            else
            {
                return arr[i];
            }
        }
        return -1;
    }*/


/*static int singleNonDuplicate(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
            return arr[mid];
        } else {
            int leftSize = mid - start;
            int rightSize = end - mid;

            if (arr[mid] == arr[mid - 1]) {
                if (leftSize % 2 == 0) {
                    start = mid + 1;
                } else {
                    end = mid - 2;
                }
            } else {
                if (rightSize % 2 == 0) {
                    end = mid - 1;
                } else {
                    start = mid + 2;
                }
            }
        }
    }

    return -1;
}
*/

/*
* public class Single_Element {
    public static void main(String[] args) {
        int[] arr = {3, 3, 7, 7, 10, 11, 11};
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Check for the single element at the boundaries
        if (arr[start] != arr[start + 1]) {
            return arr[start];
        }
        if (arr[end] != arr[end - 1]) {
            return arr[end];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the current element is the single element
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            // Adjust the search range based on the positions of mid and the adjacent elements
            if (arr[mid] == arr[mid - 1]) {
                if ((mid - start + 1) % 2 == 1) {
                    end = mid - 2;
                } else {
                    start = mid + 1;
                }
            } else {
                if ((end - mid + 1) % 2 == 1) {
                    start = mid + 2;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
*/