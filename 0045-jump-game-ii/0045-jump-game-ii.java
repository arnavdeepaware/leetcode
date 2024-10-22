class Solution {
    public int jump(int[] nums) {
        /*
            - Traverse the array
            - Need steps to track jumps
            - At start of each iteration, we check if last index can be jumped from current element
                - If yes: steps + 1
                - Else,
            - At each element, we consider all possible steps
            - We iterate through the steps and find the index with next max value
            - To avoid subsequent right shifts, we will add an iterator to our values when we compare for           max
            - We also need a maxPointer for the index of max
            - Increment step
            - We move our i to maxPointer before each iteration

            -Edge Cases
                - Single Element array: return true
                - Starting element zero: return false;

            steps = 1
            max = -1
            maxIndex = element
             i
            [2,1]
        */

        //Edge Case
        if(nums.length == 1){
            return 0;
        }

        if(nums[0] == 0){
            return 0;
        }

        int steps = 0;
        int i = 0;

        while(i < nums.length){
            //Check if last index is jumpable
            if(i + nums[i] >= nums.length - 1){
                return ++steps;
            }

            int max = -1;
            int maxIndex = -1;
            int iterator = 0;

            //Consider all possible jumps
            for(int j = i+1; j <= i + nums[i]; j++){
                //Check for max
                if(nums[j] + iterator >= max){
                    max = nums[j] + iterator;
                    maxIndex = j;
                }
                iterator++;
            }

            //Update i and steps
            i = maxIndex;
            steps++;
        }

        return steps;
    }
}