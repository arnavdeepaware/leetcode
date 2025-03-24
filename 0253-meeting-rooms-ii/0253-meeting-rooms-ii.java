class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        
        for(int i=0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int e = 0;
        int count = 0;

        for(int s = 0; s < intervals.length; s++){
            if(start[s] >= end[e]){
                count -= 1;
                e += 1;
            }

            count += 1;
        }

        return count;
    }
}


        //                     s
        // Start ---> 0, 5, 15
        // End   ---> 10, 20, 30
        //                e
        // Room = 2



        //                 s
        // Start ---> 2, 7
        // End   ---> 4, 10
        //               e
        // Room = 1