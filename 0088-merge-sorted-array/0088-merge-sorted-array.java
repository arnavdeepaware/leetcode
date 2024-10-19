class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
            - Negative Values
            - Arrays can be empty

            - Two Pointer Approach 
            
            m i
            1 2 2 3 5 6
            2 5 6
          n

            - Traverse both array from the end (m & n)
            - Keep track of the index i, which starts at m+n in num1
            - At each iteration, num1[i] = max(element m or n)
            - Decrease only the pointer with greater value
            - Traverse until n goes out of bound (merged nums2 into nums1)
            - return the updated array nums1

            Edge Case: n == 0;  
        */

        //Edge Case
        if(n == 0){
            return;
        }

        int i = m + n - 1;

        while(n > 0){
            int max;

            if( m > 0 && nums1[m-1] > nums2[n-1]){
                max = nums1[--m];
            } else {
                max = nums2[--n];
            }

            nums1[i--] = max;
        }

    }
}