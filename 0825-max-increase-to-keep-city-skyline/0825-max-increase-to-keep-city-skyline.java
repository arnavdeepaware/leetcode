class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        //Find maximum and minimum
        int[] maxH = new int[grid.length];
        int[] maxC = new int[grid.length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                maxH[i] = Math.max(maxH[i], grid[i][j]);
                maxC[i] = Math.max(maxC[i], grid[j][i]);
            }
        }

        //Add results
        int results = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                results += Math.min(maxH[i], maxC[j]) - grid[i][j];
            }
        }

        return results;
    }
}