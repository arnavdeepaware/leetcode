class Solution {
    public long coloredCells(int n) {

        long prev = 1;
        long curr = 1;
        long prevSum = 1;
        long total = 1;

        for(int i = 2; i <= n; i++){
            
            curr += 2;
            total = 2 * prevSum + curr;
            prev = curr;
            prevSum += prev;
        }
        
        return total;
        
    }
}



// prev    n       curr      total
// 1       1       1         1
// 1.      2.      prev+2    2 * prevSum + (curr) = 5
// 3       3       prev+2    
