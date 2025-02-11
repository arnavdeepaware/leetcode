class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> ans = new ArrayList<>();
        int start = 0;

        for(int i = 0; i < nums.length; i++){

            if(i == nums.length - 1 || nums[i] != nums[i+1] - 1){
                ans.add(""+nums[i]);
            }else{
                start = i;
                while(i < nums.length - 1 && nums[i] == nums[i+1] - 1){
                    i++;
                }
                ans.add(""+nums[start]+"->"+nums[i]);
            }
        }

        return ans;
        
    }
}