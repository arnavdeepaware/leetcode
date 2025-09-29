class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    int nums[];

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;

        List<Integer> current = new ArrayList<>();
        backtrack(current);
        return ans;
    }

    public void backtrack(List<Integer> curr){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int n: nums){
            if(!curr.contains(n)){
                curr.add(n);
                backtrack(curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}