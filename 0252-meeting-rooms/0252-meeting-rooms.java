class Solution {
    public boolean canAttendMeetings(int[][] intervals) {

        /*
            - Sort array - start time
            - Empty input?
            - Single interval?
            - Repeated intervals
            - End time = 2, next start time = 2

            At each iteration
                - Check if start time is valid based on previous end time
                Ex:
                    1. 2,4    5,6   --> True
                    2. 2, 5   4, 38 --> False
                    3. 1, 6   6, 9  --> True
        */

        //Sort intervals
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        //Traversal
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < intervals[i-1][1]){
                return false;
            }
        }

        return true;
        

    }
}