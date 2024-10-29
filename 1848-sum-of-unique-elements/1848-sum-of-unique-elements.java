class Solution {
    public int sumOfUnique(int[] nums) {
        //                   i
        // 0 1 1 1 2 4 4 5 5
        
        Arrays.sort(nums);
        int sum = 0;
        int i;

        for(i=0; i<nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                while(i < nums.length - 1 && nums[i+1] == nums[i]){
                    i++;
                }
            } else {
                sum += nums[i];
            }
        }

        if(i == nums.length - 1){
            sum += nums[i];
        }

        return sum;

    }
}