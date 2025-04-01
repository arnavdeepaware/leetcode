class Solution {
    public long mostPoints(int[][] questions) {

        //DP Approach
        int n = questions.length;
        long[] points = new long[n];
        points[n-1] = questions[n-1][0];

        //Traversal
        for(int i = n -2; i >= 0; i--){

            points[i] = questions[i][0];
            ///System.out.println(questions[i][0]);
            
            if(i + questions[i][1] + 1< n){
                points[i] += points[i + questions[i][1] + 1];
            }

            points[i] = Math.max(points[i], points[i+1]);
        }

        return points[0];
        
    }
}