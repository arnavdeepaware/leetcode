class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = 1;
        int nSum = 0;

        int total = 0;
        HashSet<Integer> set = new HashSet<>();

        int a = 0;
        int b = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){

                //Update nSum and n
                nSum += n;
                n++;

                //Check for repetition
                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                }else{
                    total += grid[i][j];
                    set.add(grid[i][j]);
                }
            }
        }

        b = nSum - total;
        return new int[]{a, b};

    }
}