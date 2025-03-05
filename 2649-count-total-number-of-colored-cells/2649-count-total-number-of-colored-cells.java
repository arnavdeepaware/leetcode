class Solution {
    public long coloredCells(int n) {

        return 1L + 2L * (n-1) * n;
        
    }
}



// prev    n       curr      total
// 1       1       1         1
// 1.      2.      prev+2    2 * prevSum + (curr) = 5
// 3       3       prev+2    

// n =5

// 1       1
// 3       4 (+3)
// 5       13 (+11)
// 7       25 (+12)
// 9       41 (+16)
