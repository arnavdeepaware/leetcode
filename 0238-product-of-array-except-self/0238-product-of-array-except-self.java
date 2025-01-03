class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
            - Two Pointer Approach
            - Keep track of prefix and suffix products
            - Add and multiply them in the ans array
            - prefix is for i+1
            - suffix is for i -1
            - By default the prefix of 0th is 1
            - By default the suffix of last element is 1
        */

        // Output Array 
        int n = nums.length;
        int[] ans = new int[n];


        //prefix
        int pre = 1;
        for(int i = 0; i < n; i++){
            ans[i] = pre;
            pre *= nums[i];
        }

        //suffix
        int suf = 1;
        for(int i = n-1; i >= 0; i--){
            ans[i] *= suf;
            suf *= nums[i];
        }

        return ans;
    }
}