class Solution {
    public int numIslands(char[][] grid) {

        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    res ++;
                    helper(grid, i ,j);
                }
            }
        }

        return res;
    }

    //Helper function - dfs or bfs?
    public void helper(char[][] grid, int i, int j){
        //Base Case
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';

        //Recursive Step
        
        //left
        helper(grid, i-1, j);
        //Right
        helper(grid, i+1, j);
        //Up
        helper(grid, i, j-1);
        //Down
        helper(grid, i, j+1); 
    }
}