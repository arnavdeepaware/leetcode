class Solution {
    public int longestConsecutive(int[] nums) {

        //Hashset to store all nums -- eassier for lookups
        HashSet<Integer> set = new HashSet<>();
        
        for(int n: nums){
            set.add(n);
        }

        //We will track every sequence from the starting index
            //This will avoid repetition

        int longest = 0;
              
        for(int n : set){
            //Check if n is the start of a new sequence
            if(!set.contains(n-1)){

                int curr = 1; 
                //Traverse until we reach the end of the sequence
                while(set.contains(n + 1)){
                    curr ++;
                    n++;
                }

                longest = Math.max(longest, curr);
                curr = 1; //Reset to 1 for the next sequence
            }
        }

        return longest;
    }
}