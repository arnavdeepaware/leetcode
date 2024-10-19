class Solution {
    public void rotate(int[] nums, int k) {
        /*
            - The last k elements are shifted to the front of the array
            - Reverse the array
            - Reverse the first k elements
            - Reverse the remaining elements

            k = 3
            1 2 3 4 5 6 7
            7 6 5 4 3 2 1
            5 6 7 4 3 2 1 
            5 6 7 1 2 3 4

            Edge Cases:
                - Empty Array
                - k > nums.length

        */

        if(nums.length == 1){
            return;
        }

        int n = nums.length;
        k %= n;

        int l = 0;
        int r = n-1;

        while(l < r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }

        l = 0;
        r = k-1;

        while(l < r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }

        l = k;
        r = n-1;
        while(l < r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }


        
    }
}