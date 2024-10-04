class Solution {
    public int maxArea(int[] height) {
        /*
            - Need to return the rect with max area
            - sort is not ideal as index are important
            
            - Use a two pointer approach
            - Before every iteration,
                - Max will store max area until now
            - During Each iteration,
                - Curr will be current area
                - Compare max and curr and set max to greater value
                - Change the pointer with smaller height
            - After the loop,
                - max stores the area of max rect
            
            Edge Cases:
                - Min 2 elements in array
                - Height will be non-negative
                - No edge cases
        */

        //Pointers
        int l = 0;                  //Left Pointer
        int r = height.length - 1;  //Right Pointer

        //Max Area Var
        int max = 0;

        //Traversal
        while(l<r){
            
            //Finds the current area
            int width = r - l;      //Right - left indexes(pointers)
            int len = Math.min(height[r], height[l]);  // Will use the smaller height

            int curr = width * len;

            //Update max value
            max = Math.max(max, curr);

            //Change the pointer with smaller height
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }

        //max stores the desired area
        return max;
    }
}