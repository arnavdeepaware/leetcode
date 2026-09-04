class Solution {
    public int majorityElement(int[] nums) {
        
        /*
            U - Understand
            - Min. length of input array? -> 1
            - Does the answer always exist? -> yes
            - can numbers be negative or zero? -> no
            - can be equal to n/2 or strictly greater than n/2? -> strictly greater

            -> 3 5 5 5 3 5 5 4

            M - Match

             - Brute force. - nested loops
             - Hash Map - map the count for every number, return the num when it hits n/2 + 1
             - Sorting - return n/2

             - boyer - moore voting algorithm

             P - Plan

             - We know there is one number, let's call it X that occurs atleast more than once than all other numbers combined. Let's call all other numbers combined together as Y (Y can be single or multiple numbers)

             - X category will always occur more than Y category. Y will be completely canceled out.

             - For example, we have 6 occurences of X and 5 of Y category, if we count +- 1 in an efficient way, we will be left with leftovers of X

             

             - declare ct and tempX
             - Traverse all of nums (input)
             - At each occurence,

                - if ct == 0, update tempX to be that num
                - if num == tempX, 
                        ct increments, 
                        else decrments

            - after loop, return tempX

            
        */

        int ct = 0;
        int tempX = 0;

        //Loop starts
        for(int num : nums){
            // update tempX to be num
            if(ct == 0) tempX = num;

            //increment or decrement num acc to condition
            ct += (num == tempX) ? 1 : -1; 
        }
        //Loop ends


        return tempX;
    }
}
