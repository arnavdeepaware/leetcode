class Solution {
    public boolean containsDuplicate(int[] nums) {

        //Hash Set or Sorting
        HashSet<Integer> visited = new HashSet<>();

        for(int n : nums){

            //Check if n is already visited
            if(visited.contains(n)){
                return true;
            }
            
            //n is not visited 
            visited.add(n);
        }

        return false;
    }
}