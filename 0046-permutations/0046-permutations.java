class Solution {

    //Class variables
    private List<List<Integer>> ans = new ArrayList<>();
    private int[] nums;

    //Premute Function
    public List<List<Integer>> permute(int[] nums) {
        //Assign nums to class variable
        this.nums = nums;

        //Create empty arraylist for backtrack func. input
        List<Integer> curr = new ArrayList<>();

        //call backtracking function and return ans
        backtrack(curr);
        return ans;
    }

    //Backtrack function
    public void backtrack(List<Integer> curr){
        //Base Case
        if(curr.size() == nums.length){
            //add a deep copy of curr at this point to ans
            ans.add(new ArrayList<>(curr));
            return;
        }

        //Choice
        for(int n: nums){
            if(!curr.contains(n)){  //no repeated nums
                curr.add(n);
                backtrack(curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}

/*
    - need to find all possible permutations
    - all possible sets containing all elements in nums - order matters
    - input size <= 6: backtracking can be useful here

    Backtracking
    base case: when array reaches size of nums
    choice: at each level, add all nums and recurse
    backtrack step: remove the num added, add next one

    - inputs: current list of elements (changes), ans array (add lists), input array (no changes)
    - can use ans array and input array as global variables
    - check base case
    - need a for loop for choices in backtrack function
    - add n (no repeated nums)
    - backtrack
    - remove n

    - permute function
    - assign nums as global variable
    - create an empty arraylist ... this is the first input of backtrack function
    - call backtrack function
    - return ans list
*/