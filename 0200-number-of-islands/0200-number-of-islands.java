class Solution {
    public int numIslands(char[][] grid) {

        int numOfIslands = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    numOfIslands++;
                    helper(grid, i, j);
                }
            }
        }

        return numOfIslands;
    }

    //helper
    public void helper(char[][]grid, int i, int j){
        //Edge case
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';

        //Recursive Step

        //Left
        helper(grid, i-1, j);
        //Up
        helper(grid, i, j-1);
        //Right
        helper(grid, i+1, j);
        //Down
        helper(grid, i, j+1);

        return;
    }
}