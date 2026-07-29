class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //Hashset
        HashSet<Integer> set = new HashSet<>();

        //Loop
        for(int n: nums){
            if(set.contains(n)) return true;
            set.add(n);
        }

        return false;
    }
}


/*
    - int array as input 
    - t/f as output
    - check if any value reoccurres even once 

    - can array be empty -- no, at least 1 
    - can there be multiple duplicates, if so can we return any? -> yes and yes

    - nested for loops
    - sort the array
    - hashset to store numbers and check if it occurred before 
*/