class Solution {
    public int majorityElement(int[] nums) {
        
        /*
            U - Understand
            - Min. length of input array?
            - Does the answer always exist?

            -> 5 3 5 5 3

            - Count variable and tempX
            - iterate through nums
            - assign tempX as nums[0]
            - At each iteraton
                    - if num[i] == tempX
                        - increase count
                    - else
                        - decrease count
                        - if count == 0
                        - tempX = nums[i] -- check for last element 

            - return tempX
        */

        int ct = 0;
        int tempX = nums[0];

        for(int i = 0; i < nums.length; i++){
            if (nums[i] == tempX){
                ct++;
            }else{
                ct--;

                if(ct == 0 && i < nums.length - 1){
                    tempX = nums[i + 1];
                }
            }
        }

        return tempX;
    }
}