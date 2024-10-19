class Solution {
    public boolean canJump(int[] nums) {
        /*
            - Create a set
            - The set will contain the indexes that cen be possible visited
            - At each index, we add possible indexes to the set
            - We traverse the array
            - If the index is not possible, we skip it
            - At the end of the traversal, last inddex value should be in our set
        */

        HashSet<Integer> set = new HashSet<>();

        if(nums.length < 2){
            return true;
        }

        set.add(0);

        for(int i = 0; i < nums.length - 1; i++){
            if(set.contains(i)){
                for(int j = 1; j <= nums[i]; j++){
                    set.add( i + j);
                }
            }

            if(set.contains(nums.length - 1)){
                return true;
            }
        }

        return false;
    }
}