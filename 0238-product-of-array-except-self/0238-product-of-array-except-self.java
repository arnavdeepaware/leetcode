class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
            - Two Pointer Approacj
            - Keep track of prefix and suffix products
            - Add and multiply them in the ans array
            - prefix is for i+1
            - suffix is for i -1
            - By default the prefix of 0th is 1
            - By default the suffix of last element is 1
        */

        // Output Array and default values
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);

        //Pointers
        int l = 0;
        int r = nums.length - 1;

        //Products
        int pre = 1;
        int suf = 1;

        while(l < nums.length - 1 && r > 0){
            //Update values of pre and suf
            pre *= nums[l];
            suf *= nums[r];

            ans[l+1] *= pre;
            ans[r-1] *= suf;

            l++;
            r --;
        }

        return ans;
    }
}