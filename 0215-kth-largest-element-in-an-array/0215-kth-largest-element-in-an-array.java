class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int i = 0;
        
        while(minHeap.size() < k && i < nums.length){
            minHeap.offer(nums[i]);
            i++;
        }

        for(; i < nums.length; i++){
            if(nums[i] > minHeap.peek()){
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        return minHeap.poll();
    }
}