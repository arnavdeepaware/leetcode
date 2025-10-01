class Solution {
    public int numWaterBottles(int n, int e) {

        int total = 0;
        int prevEmpty = 0;
        int empty = 0;

        while(n > 0){
            total += n;
            empty = (n + prevEmpty) % e;
            n = (n + prevEmpty) / e;
            prevEmpty = empty;
        }

        return total;
        
    }
}