class Solution {
    public void rotate(int[][] matrix) {

        //Transpose and then reverse rows

        //Transpose
        for(int r = 0; r < matrix.length; r++){
            for(int c = r+1; c < matrix.length; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }

       

        //Reverse Rows
        for(int r = 0; r < matrix.length; r++){
            int j = matrix.length - 1;
            for(int c = 0; c < matrix.length / 2; c++){
                //Swap for reverse
                int temp = matrix[r][c];
                matrix[r][c] = matrix[r][j];
                matrix[r][j] = temp;
                j--;
            }
        }

        return;       
    }
}