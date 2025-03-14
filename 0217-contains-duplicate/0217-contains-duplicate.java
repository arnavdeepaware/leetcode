class Solution {
    public boolean containsDuplicate(int[] nums) {

        // //Storage Efficient
        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length - 1; i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }

        // return false;

        //Memory Efficient
        HashSet <Integer> set = new HashSet<Integer>();

        for(int n: nums){
            if(set.contains(n)){
                return true;
            }

            set.add(n);
        }

        return false;
        
    }
}