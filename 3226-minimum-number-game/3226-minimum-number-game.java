class Solution {
    public int[] numberGame(int[] nums) {
        
        //Sorting Array
        for (int i = 0; i < nums.length; i++){
            int min = nums[i];
            int minIndex = i;
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] < min){
                    min = nums[j];
                    minIndex = j;
                }
            }
            nums[minIndex] = nums[i];
            nums[i] = min;
            
        }

        for ( int i = 0; i < nums.length; i += 2){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
            
        return nums;
    }
}