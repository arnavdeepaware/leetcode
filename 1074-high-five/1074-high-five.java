import java.util.*;

class Solution {
    public int[][] highFive(int[][] items) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for (int[] stu : items) {
            int id = stu[0];
            int score = stu[1];
            
            // Initialize priority queue (min-heap) if not already present
            PriorityQueue<Integer> scores = map.getOrDefault(id, new PriorityQueue<>(5));

            // Add the new score to the priority queue
            if (scores.size() < 5) {
                scores.add(score);
            } else if (scores.peek() < score) {
                scores.poll(); // Remove the smallest score
                scores.add(score); // Add the new score
            }

            map.put(id, scores);
        }

        // Prepare the result array
        int[][] ans = new int[map.size()][2];
        int i = 0;
        for (int id : map.keySet()) {
            ans[i][0] = id;
            ans[i][1] = findAverage(map.get(id)); // Calculate the average of top 5 scores
            i++;
        }

        // Sort the result by id
        Arrays.sort(ans, (a, b) -> Integer.compare(a[0], b[0]));
        
        return ans;
    }

    public int findAverage(PriorityQueue<Integer> scores) {
        int sum = 0;
        int total = scores.size(); // Get the number of elements before polling

        while (!scores.isEmpty()) {
            sum += scores.poll();
        }

        return sum / total; // Return the average
    }
}
