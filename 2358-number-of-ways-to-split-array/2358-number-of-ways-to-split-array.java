class Solution {
    public int waysToSplitArray(int[] nums) {
        //Sum the entire array
        // For every i - split the sum into left and right
        // Add ith element to left and remove it from right
        //Compare left and right and increment count accordingly
        //Traverse from index 0 to n - 1
        //Return count

        
        // Sum of the array
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        //System.out.println("Total sum: " + sum);

        //Find valid splits
        long leftSum = 0;
        long rightSum = sum;
        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){
            leftSum += nums[i];
            rightSum -= nums[i];

            //Check for split
            if(leftSum >= rightSum){
                count ++;
            }
        }

        return count;
    }
}