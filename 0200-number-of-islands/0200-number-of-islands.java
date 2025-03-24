class Solution {
    public int numIslands(char[][] grid) {

        int ct = 0;

        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] == '1'){
                    helper(grid, row, col);
                    ct++;
                }
            }
        }

        return ct;
    }

    public void helper(char[][] grid, int r, int c){
        //Edge Cases
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = '0';

        //Up
        helper(grid, r-1, c);

        //Right
        helper(grid, r, c+1);

        //Down
        helper(grid, r+1, c);

        //Left
        helper(grid, r, c-1);
    }
}