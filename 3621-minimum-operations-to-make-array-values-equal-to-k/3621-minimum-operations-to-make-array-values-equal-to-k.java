class Solution {
    public int minOperations(int[] nums, int k) {

        /*
            - Can nums be empty
            - negative numbeers
            - range of k
            - when k is greater than all elements in nums?
                - we return false when min element > k

            use a hashset to store all unique nums
            we also track the min element
            check for edge case min > k
            there are two cases:
                - k < min -> return num of distinct elements
                - k == min -> return num of distinct elements - 1   
        */

        HashSet<Integer> set = new HashSet<>();
        int min = 101;


        for(int n: nums){
            if(n < min){
                min = n;
            }

            set.add(n);
        }

        //False case
        if(min < k){
            return -1;
        }

        //Min > k
        if(min > k){
            return set.size();
        }        

        //Min == k
        return set.size() - 1;
    }
}