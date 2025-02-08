class Solution {
    public int makePrefSumNonNegative(int[] nums) {

        int ct = 0;
        int prefixSum = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int n: nums){
            if(n < 0){
                pq.offer(n);
            }

            prefixSum += n;

            while(prefixSum < 0 && !pq.isEmpty()){
                prefixSum -= pq.poll();
                ct++;
            }
        }

        return ct;
        
    }
}