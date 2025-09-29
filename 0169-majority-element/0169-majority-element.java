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
        Integer temp = null;

        for(int n: nums){
            if(ct == 0) temp = n;

            ct += (n == temp) ? 1: -1;
        }

        return temp;
    }
}

/*
             m
    - [1,2,2,2,2,6,9]

    
                m
    - [[1,1,1,2,2,2,2,2]]
*/