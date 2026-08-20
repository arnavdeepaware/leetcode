class Solution {

    public int orangesRotting(int[][] grid) {

        // Intialization
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> q = new ArrayDeque<>();
        int fresh = 0;
        int time = 0;

        //First Traversal
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                //Fresh Orange
                if(grid[r][c] == 1){
                    fresh ++;
                }
                //Rotten Orange
                if(grid[r][c] == 2){
                    q.offer(new int[]{r, c});
                }
            }
        }

        //BFS
        while(fresh > 0 && !q.isEmpty()){
            int len = q.size();
            for(int i = 0; i < len; i++){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                //Check neighbors in all 4 directions
                for(int[] dir: directions){
                    int row = r + dir[0];
                    int col = c + dir[1];
                    //If fresh orange and in bounds
                    if (row >= 0 && row < grid.length &&
                        col >= 0 && col < grid[0].length &&
                        grid[row][col] == 1){
                            grid[row][col] = 2;             //Mark as rotten
                            q.offer(new int[]{row, col});   //Add to queue
                            fresh--;                        // Decrement num of fresh oranges
                    }                     
                }
            }
            //Increment time
            time++;
        }
        return fresh == 0? time: -1;
    }
}


/*

    - Create a queue, mins, num of fresh oranges
    - Traverse the grid one time (first), 
            - add rotten oranges to queue
            - increment num of fresh oranges 
    - while loop for bfs
    - keep going until queue is empty
    - at every iteration of the search level, 
            - check neighbors and mark as rotten if fresh
            - also decrement number of fresh oranges
            - add new rotten oranges to the queue
    
    - return minutes if num of oranges is zero
    - else return -1
*/