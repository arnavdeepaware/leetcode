class Solution {
    public int majorityElement(int[] nums) {
        
        // Boyer-Moore Voting Algorithm
        /*
            - We use increment and decrements
            - We store the count and assume the first element as majority element
            - Traverse the array, 
                - If element is == majority, increment count
                - Else, decrement 
                - If anytime, count == 0, we reset the majority to next element
            - Given the constraints of the problem, there are more majority elements than minority.
            - We are cancelling the majority count by minority times.
            - At the end, when all minorities are counted, we will inevitably be left with the majority
            - It is important to never let count go to -1
        */

        int ct = 1;
        int majority = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == majority){
                ct++;
            }else{
                ct--;
            }

            if(ct == 0){
                ct = 1;
                majority = nums[++i];
            }
        }

        return majority; 

    }
}