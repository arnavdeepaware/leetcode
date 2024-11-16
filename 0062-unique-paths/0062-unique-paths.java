class Solution {
public int uniquePaths(int i, int j) {
	
	//Edge Case
	// if(i == 1 || j == 1){
	// 	return 1;
    // }

    int[][] paths = new int[i][j];

    return helper(i-1, j-1, paths);
}

public int helper(int i, int j, int[][] paths){
	
//Base Case
if(i == 0 || j == 0){
		paths[i][j] = 1;
return 1;
}

//Memoization
if(paths[i][j] > 0){
	return paths[i][j];
}

paths[i][j] = helper(i-1, j, paths) + helper(i, j-1, paths);
return paths[i][j];
}

}