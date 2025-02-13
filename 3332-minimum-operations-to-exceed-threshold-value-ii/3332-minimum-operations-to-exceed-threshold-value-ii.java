class Solution {
    public int minOperations(int[] nums, int k) {

        if(nums.length < 2){
            return 0;
        }
        
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int n: nums){
            pq.offer((long)n);
        }

        int ct = 0;

        while(pq.peek() < k){
            long a = pq.poll();
            long b = pq.poll();

            pq.offer(a * 2 + b);
            ct++;
        }

        return ct;
    }
}