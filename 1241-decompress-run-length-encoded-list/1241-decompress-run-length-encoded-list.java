class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        ArrayList<Integer> rle = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i+= 2){

            for (int j = 0; j < nums[i]; j++){
                rle.add(nums[i+1]);
            }
        }
        int[] ans = new int[rle.size()]; 
        int i = 0;
        for(int x : rle){
            ans[i] = x;
            i++;
        }

    return ans;
    }
}