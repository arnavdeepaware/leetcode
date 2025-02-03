class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        //Increasing
        int maxIncreasing = 1;
        int left = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                int len = i - left;
                maxIncreasing = Math.max(maxIncreasing, len);
                left = i;
            }
        }

        maxIncreasing = Math.max(maxIncreasing, nums.length - left);

        //Decreasing
        int maxDecreasing = 1;
        left = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= nums[i-1]){
                int len = i - left;
                maxDecreasing = Math.max(maxDecreasing, len);
                left = i;
            }
        }

        maxDecreasing = Math.max(maxDecreasing, nums.length - left);


        return Math.max(maxDecreasing, maxIncreasing);
    }
}