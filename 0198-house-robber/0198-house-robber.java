class Solution {
    public int rob(int[] nums) {

        /*
            - base case first two houses: choose the one with more money

            - from third house: 2 choices: we will optimize every iteration

            -  we can either choose curr house 'i' + 'i-2' 
            -  or we can only choose 'i-1'

            [2,7,11,11,12]
        */

        int n = nums.length;

        //Edge Cases
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        
        nums[n-2] = Math.max(nums[n-2], nums[n-1]);

        for(int i = n-3; i >= 0; i--){
            nums[i] = Math.max(nums[i+2] + nums[i], nums[i+1]);
        }

        return nums[0];
    }
}