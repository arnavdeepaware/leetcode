class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> answer = new ArrayList<>();
        
        for(int i = 0; i < l.length; i++){
            
            int start = l[i];
            int end = r[i];

            int[] temp = Arrays.copyOfRange(nums, start, end+1);
            answer.add(isArithmetic(temp));
        }

        return answer;
    }

    public boolean isArithmetic(int[] nums){

        if(nums.length < 2){
            return false;
        }

        Arrays.sort(nums);
        int diff = nums[1] - nums[0];

        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i+1] - nums[i] != diff){
                return false;
            }
        }

        return true;
    }

}