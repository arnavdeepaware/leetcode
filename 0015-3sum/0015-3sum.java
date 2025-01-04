class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            
            if(i>0 && nums[i-1] == nums[i]){
                continue;
            }
            
            int target = -1 * nums[i];

            int l = i + 1;
            int r = nums.length - 1;

            while(l < r){
                int sum = nums[l] + nums[r];

                if(sum == target){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);

                    ans.add(triplet);
                    //Duplicates
                    while(l < r && nums[l] == nums[l + 1]){l++;}
                    while(l < r && nums[r] == nums[r - 1]){r--;}

                    l++;
                    r --;
                    continue;
                }

                if(sum < target){
                    l++;
                }else{
                    r--;
                }
            }
        }

        return ans;
    }
}