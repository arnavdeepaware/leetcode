class Solution {
    public int removeDuplicates(int[] nums) {
        
        /*
            - Two Pointers
            - Right goes through all elements one by one - curr 
            - Left pointer starts at 0 and moves only when we add a valid num to it
            - If a number is invalid, 
                - We move right pointer only
            - If number is valid,
                - We movb both pointers
            - We can check for pointers by comparing last two elements or keeping a count

            Edge Cases:
            - Empty array
            - Array.length < 2 : k = array.length
            - negative numbers: no affect
        */

        //Pointers
        int pos = 0;

        for(int n: nums){
            //Check for validity
            if (pos < 2 || n != nums[pos-2]){
                nums[pos] = n;
                pos++;
            }
        }

        return pos;

    }
}