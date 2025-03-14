class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //Map to store freq of elements
        HashMap<Integer, Integer> map = new HashMap<>();

        //Loop to populate the map
        for(int n: nums){
            int count = map.getOrDefault(n, 0);
            map.put(n, count + 1);
        }

        //Min-Heap to maintain top k elements
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for(int n: map.keySet()){
            pq.offer(new int[]{n, map.get(n)});
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = pq.poll()[0];
        }


        return ans;
    }
}