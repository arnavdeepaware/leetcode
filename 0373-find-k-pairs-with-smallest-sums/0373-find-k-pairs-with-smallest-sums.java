class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        //Brute Force

        /*
            - Traverse all m*n possible pairs
            - Store them in a heap
            - Use a comparator to compare pairs for their sums
        */

        //Better Approach
        /*
            - We know the arrays are sorted
            - So the smallest sum will always be the first elements
            - After that, there are two possibilities, move to the next element on either array
            - For the next pair we choose, we will again have two choices, however, we need to track prev possbile pairs as they are independent and can have a smaller sum
            - We need to traverse the possible pairs and store them in sorted order - queue
            - We do this until we have k pairs in our ans 

            - Create the ans list
            - Create a heap that takes int[] and sorts them for the sum
            - Create a hashset to avoid repetitive pairs
            - Add first pair to set and queue
            - Use a loop.
            - pop first element of queue, add to answer
            - add next two possible pairs to queue if unvisited
            - stop when ans has k pairs
        */

        int n = nums1.length;
        int m = nums2.length;

        List<List<Integer>> ans = new ArrayList<>();
        Set<Pair<Integer, Integer>> visited = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[0] - b[0]));

        //Add first pair
        pq.offer(new int[]{nums1[0] + nums2[0],0,0});
        visited.add(new Pair<Integer, Integer>(0,0));

        //Traversal
        while(ans.size() < k){
            int[] top = pq.poll();
            int i = top[1];
            int j = top[2];
            ans.add(List.of(nums1[i], nums2[j]));

            //Adding new pairs
            if(i + 1 < n && !visited.contains(new Pair<Integer, Integer>(i+1, j))){
                pq.offer(new int[]{nums1[i+1] + nums2[j], i+1, j});
                visited.add(new Pair<Integer, Integer>(i+1, j));
            }

            if(j + 1 < m && !visited.contains(new Pair<Integer, Integer>(i, j+1))){
                pq.offer(new int[]{nums1[i] + nums2[j+1], i, j+1});
                visited.add(new Pair<Integer, Integer>(i, j+1));
            }
        }

        return ans;
        
    }
}