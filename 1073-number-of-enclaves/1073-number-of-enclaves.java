class Solution {
    public int numEnclaves(int[][] grid) {

        //Traverse the boundary only
        //Do DFS and change all conncted 1 to 0

        //Traverse again looking for 1s in the grid
        //return count of 1s

        int n = grid.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(i == 0 || i == n - 1 || j == 0 || j == grid[0].length - 1){
                    helper(grid, i, j);
                }
            }
        }

        int count = 0;

        for(int i = 1; i < n-1; i++){
            for(int j = 1; j < grid[0].length-1; j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
        }

        return count;
        
    }

    void helper(int[][]grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return;
        } 

        if(grid[i][j] == 0){
            return;
        }
        
        grid[i][j] = 0;

        helper(grid, i-1, j);
        helper(grid, i, j+1);
        helper(grid, i+1, j);
        helper(grid, i, j-1);
    }
}