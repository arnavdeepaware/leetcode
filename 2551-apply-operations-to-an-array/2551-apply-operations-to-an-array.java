class Solution {
    public int[] applyOperations(int[] nums) {

        int[] ans = new int[nums.length];
        int n = nums.length;

        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                if(i < n-1 && nums[i] == nums[i+1]){
                    ans[j] = nums[i] * 2;
                    nums[i+1] = 0;
                } else{
                    ans[j] = nums[i];
                }
                j++;
            }


            // if(i < n-1 && nums[i] == nums[i+1]){
            //     ans[j] = nums[i] * 2;
            //     nums[i+1] = 0;
            //     j++;
            // }else if(nums[i] > 0){
            //     ans[j] = nums[i];
            //     j++;
            // }
        }

        return ans;
        
    }
}