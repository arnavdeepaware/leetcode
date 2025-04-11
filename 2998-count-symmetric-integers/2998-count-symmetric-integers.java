class Solution {
    public int countSymmetricIntegers(int low, int high) {

        /*  
            - Given the constraints of the problem, we will only have symmteric numbers when they are two or four digit numbers
            - If its two digit:
                - Check for divsibility by 11
            - If its for digits:
                - Find the left sum
                - Find the right sum
                - Compare the sums
            - Initialize a counter
            - Traverse from all numbers between low and high inclusive

            - return the count
        */

        int count = 0;

        for(int n = low; n <= high; n++){
            //Check for two digits
            if( n < 100 && n % 11 == 0){
                count++;
            }

            else if (n >= 1000 && n < 10000){
                int right = (n % 100) / 10 + (n % 10);
                int left = (n / 1000) + (n / 100) % 10;

                if(left == right) count++;
            }
        }

        return count;
        
    }
}