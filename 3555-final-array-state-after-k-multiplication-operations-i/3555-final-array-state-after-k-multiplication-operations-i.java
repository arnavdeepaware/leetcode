class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            int value = Integer.compare(a[0], b[0]);
            if(value == 0){
                return Integer.compare(a[1], b[1]);
            }
            return value;
        });

        for(int i = 0; i < nums.length; i++){
            pq.offer(new int[]{nums[i], i});
        }

        while(k > 0){
            int[] temp = pq.poll();
            temp[0] *= multiplier;
            pq.offer(temp);
            k--;
        }

        int[] ans = new int[nums.length];
        while(!pq.isEmpty()){
            int[] temp = pq.poll();
            int index = temp[1];
            ans[index] = temp[0];
        }

        return ans;
        
    }
}