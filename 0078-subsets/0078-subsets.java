class Solution {

    List<List<Integer>> res = new ArrayList<>();
    int[] nums;


    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;

        List<Integer> current = new ArrayList<>();
        backtrack(0, current);

        return res;
    }

    public void backtrack(int i, List<Integer> current){
        //Base Case
        if(i == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

        //Case 1: add current element
        current.add(nums[i]);
        backtrack(i+1, current);

        //Case 2: dont add current element
        current.remove(current.size()-1);
        backtrack(i+1, current);
    }
}