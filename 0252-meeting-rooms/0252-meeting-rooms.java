class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        
        /*
            - Sort with start times
        */

        Arrays.sort(intervals, (a,b)->(a[0] - b[0]));

        for(int i = 1; i < intervals.length; i++){
            //Stop if start time is not after prev end time
            if(intervals[i][0] < intervals[i-1][1]){
                return false;
            }
        }

        return true;

        
    }
}