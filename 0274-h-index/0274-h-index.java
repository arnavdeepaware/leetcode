class Solution {
    public int hIndex(int[] citations) {
        /*
        n = 4
        n - i = 2
        max-H = 0

             i               
        [0 0 4 4]             [3 1 1]
         0 1 2 3

        n = 5
        n - i = 2
        n - i >= nums[i] -> t
        max-H = 3

         i
        [0 1 3 5 6]         [6 5 3 1 0]
         0 1 2 3 4

            -  Sort the array
            -  Traverse the array
            - n - i represents the max num of papers possible at each index
            - We iterate until max numbers of papers are possible
            - Return max

            - Edge Cases
                - After sorting is the first element is larger than n
                    - We return n

                    Ex: [5, 6]
                    - The h-value can be 2: 2 papers with atleast 2 citations 
        */

        Arrays.sort(citations);
        int n = citations.length;

        //Edge Case
        if(citations[0] >= n){
            return n;
        }

        //Max variable for h-value
        int max = -1;

        //Traversal
        for(int i = 0; i < n; i++){
            //Check if current h-value is possible
            if(n - i >= citations[i]){
                max = citations[i];
            } else if(n - i > max) {
                max = n - i;
            }
        }

        return max;

    }
}