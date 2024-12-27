class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        /*
            - Approach
                - We store our result and max value on the left side
                - With each iteration we check if our max + current[j] > max
                    - If yes we update our res
                - At the end of each iteration, our max holds the max element traversed - distance
                - At start of each iteration, we decrement max to account for the subtracting the distance
            
            - Logic:
                - We alwways store the highest possible element - distance as it will yield the highest value from the left side of the array
                - As at each iteration we are calculating the max, we need to just check for the highest result based on current iteration
        */
        int result = 0;
        int max = values[0];

        for(int i=1; i < values.length; i++){
            max--;
            result = Math.max(result, max + values[i]);
            max = Math.max(max, values[i]);
        }

        return result;
    }
}