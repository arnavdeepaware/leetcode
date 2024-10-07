class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        /*
            - 
        */

        int[] res = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
            int count = 0;
            int xCenter = queries[i][0];
            int yCenter = queries[i][1];
            int radius = queries[i][2];

            for(int j = 0; j < points.length; j++){
                int x = points[j][0];
                int y = points[j][1];
                
                if(Math.sqrt(Math.pow(x - xCenter,2) + Math.pow(y - yCenter, 2)) <= radius){
                    count++;
                }
            }

            res[i] = count;
        }
        return res;
    }
}