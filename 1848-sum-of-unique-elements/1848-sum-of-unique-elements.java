class Solution {
    public int sumOfUnique(int[] nums) {

        //Counting Sort with 2 Arrays

        int[] count = new int[101]; //Given Constraint -> 1 <= nums[i] <= 100

        for(int i=0; i<nums.length; i++){
            count[nums[i]] ++;
        }

        int sum = 0;
        for(int i=0; i< count.length; i++){
            if(count[i] == 1){
                sum += i;
            }
        }

        return sum;
        
    }
}