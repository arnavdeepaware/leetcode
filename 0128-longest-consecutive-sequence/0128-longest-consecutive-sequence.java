class Solution {
    public int longestConsecutive(int[] nums) {

        /*
            - sort the array and then use a loop to keep track of longest cons. sequence 
            - sorting will be N. log(n) runtime

            - O(n) solution
            - sorting was helping us find consecutive elements, if we can retrieve and check for any number n, if it is part of a sequence, we won't need sorting
            - hash set to store all n in nums
            - with a set we can check if n, n+1 or n-1 exists
            - to avoid multiple loops, we want to check if n is the start of a new sequence
                        - we check if n-1 exists
                                - if yes, n is already part of a sequence
                                - if no, start a while loop, incrementing n until it is no longer part of the set
                                        - use a counter to keep track of the length of the sequence
                                        - update the max as needed
            - after loop/traversal, return max
        */

        //Hashset to store all nums 
        HashSet<Integer> set = new HashSet<>();

        //Populate the set with the input
        for(int n: nums){
            set.add(n);
        }

        //max variable: return variable
        int max = 0;

        //Loop
        for(int n: set){
            
            //Check if n is part of a sequence: n-1 shouldn't be part of the set to continue
            if(!set.contains(n-1)){
                
                //Starting length of the current sequence
                int curr = 1;

                //while loop to find the length of this sequence
                while(set.contains(n+1)){
                    curr++;
                    n++;
                }

                //Update max
                max = Math.max(max, curr);
            }
        }

        return max;        
    }
}