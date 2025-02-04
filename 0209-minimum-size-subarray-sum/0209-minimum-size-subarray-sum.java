class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int min = Integer.MAX_VALUE;

        int l=0;
        int r=0;

        for(r=0; r < nums.length; r++){
            if(nums[r] == target){
                return 1;
            }

            sum += nums[r];

            while(sum >= target){
                min = Math.min(min, r - l + 1);
                sum -= nums[l++];
            }   
        }

        return min == Integer.MAX_VALUE? 0: min;
    }
}