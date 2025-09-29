class Solution {

    private List<List<Integer>> ans = new ArrayList<>();
    private int[] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;

        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, curr);
        return ans;
    }

    public void backtrack(int i, List<Integer> curr){
        //Base case
        if(i == nums.length){
            //Add a deep copy of curr to ans
            ans.add(new ArrayList<>(curr));
            return;
        }

        //Choice
        curr.add(nums[i]);
        backtrack(i+1, curr);
        curr.remove(curr.size() - 1);


        while(i + 1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }

        backtrack(i + 1, curr);
    }
}