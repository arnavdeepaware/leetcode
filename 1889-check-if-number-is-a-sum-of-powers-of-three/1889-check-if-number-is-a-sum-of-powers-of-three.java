class Solution {
    public boolean checkPowersOfThree(int n) {
        
        if(n % 3 == 1){
            n--;
        }
        
        int divisor = 3;

        while(n > 0){
            if(n % 3 == 2){
                return false;
            }

            n /= 3;
        }

        return true;
    }
}