class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        /*
            - We can use bitmasking to create a mask of allowed bits (characters) from a to z
            - set bits for each char using OR and left shift

            - Initialize a counter
            - For every word,
                - Set a boolean to true
                - Loop through every char in words
                - Check with the allowedbits by using rightshift and AND
                - If not found, set boolean to false, break loop
                - At the end of inner loop, if boolean is true increase counter

            - return the count of consistent strings
        */

        //Setting allowed bits
        int allowedBits = 0;
        for(char c: allowed.toCharArray()){
            allowedBits |= 1 << (c - 'a');
        }

        //Counter
        int count = 0;

        //Loop
        for(String word: words){
            boolean isConsistent = true;
            for(char c: word.toCharArray()){
                int bit = (allowedBits >> (c - 'a')) & 1;
                if(bit == 0){
                    isConsistent = false;
                    break;
                }
            }

            if(isConsistent) count++;
        }

        return count;

    }
}