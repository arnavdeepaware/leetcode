class Solution {
    public int findMinArrowShots(int[][] points) {

        //Sort the array by end times
        Arrays.sort(points, (p1, p2)-> {
            if(p1[1] == p2[1]) return 0;
            if(p1[1] < p2[1]) return -1;
            return 1;
        });

        //Assign arrows and currArrowEnd
        int arrows = 1;
        int currArrowEnd = points[0][1];

        for(int[] point: points){
            
            //If balloon starts after currArrowEnd
            if(point[0] > currArrowEnd){
                arrows++;
                currArrowEnd = point[1];
            }
        }

        return arrows;
        
        
    }
}