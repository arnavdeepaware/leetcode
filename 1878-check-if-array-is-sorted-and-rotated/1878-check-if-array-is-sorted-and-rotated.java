class Solution {
    public boolean check(int[] nums) {
        
        boolean once = false;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1] < nums[i]){
                if(once){
                    return false;
                }
                once = true;
            }
        }

        if(once){
            return nums[nums.length - 1] <= nums[0];
        }

        return true;
    }
}