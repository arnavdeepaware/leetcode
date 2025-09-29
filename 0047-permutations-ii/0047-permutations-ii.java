class Solution {

    //Class variables
    private List<List<Integer>> ans = new ArrayList<>();
    private int[] nums;


    public List<List<Integer>> permuteUnique(int[] nums) {
        //Assign nums to class variable
        this.nums = nums;

        //Create empty arraylist for backtrack func. input
        List<Integer> curr = new ArrayList<>();

        //Hashmap for counter
        HashMap<Integer, Integer> counter = new HashMap<>();
        for(int n: nums){
            int ct = counter.getOrDefault(n, 0);
            counter.put(n, ct+1);
        }

        //call backtracking function and return ans
        backtrack(curr, counter);
        return ans;
    }

    //Backtrack function
    public void backtrack(List<Integer> curr, HashMap<Integer, Integer> counter){
        //Base Case
        if(curr.size() == nums.length){
            //add a deep copy of curr at this point to ans
            ans.add(new ArrayList<>(curr));
            return;
        }

        //Choice
        for(Map.Entry<Integer, Integer> entry: counter.entrySet()){
            Integer num = entry.getKey();
            Integer count = entry.getValue();

            if(count == 0) continue;

            curr.add(num);
            counter.put(num, count-1);

            backtrack(curr, counter);
            curr.remove(curr.size() - 1);
            counter.put(num, count);
        }
    }
}