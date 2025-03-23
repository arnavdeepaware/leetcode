class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        ArrayList<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){

            int start = intervals[i][0];
            int prevEnd = merged.get(merged.size()-1)[1];

            if(start <= prevEnd && intervals[i][1] > prevEnd){
                int[] lastInterval = merged.get(merged.size() - 1);
                lastInterval[1] = intervals[i][1];
                merged.set(merged.size() - 1, lastInterval);
            } else if(intervals[i][1] > prevEnd){
                merged.add(intervals[i]);
            }
        }

        int[][] ans = new int[merged.size()][2];
        for(int i = 0; i < merged.size(); i++){
            ans[i] = merged.get(i);
        }

        return ans;
    }
}