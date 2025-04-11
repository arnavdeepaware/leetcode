class Solution {
    public int countSymmetricIntegers(int low, int high) {

        /*  
            - Initialize a counter
            - Traverse from all numbers between low and high inclusive
            - Convert them to a string
            - Skip odd length strings
            - Else, divide into halves
            - compute and compare the sums for the halves
            - If equal increase counter

            - return the count
        */

        int count = 0;

        for(int num = low; num <= high; num++){
            String n = Integer.toString(num);

            //Check for odd length
            if(n.length() % 2 == 1) continue;

            String h1 = n.substring(0, n.length() / 2);
            String h2 = n.substring(n.length() / 2);

            int sum = 0;

            for(char c: h1.toCharArray()){
                sum += Character.getNumericValue(c);
            }

            for(char c: h2.toCharArray()){
                sum -= Character.getNumericValue(c);
            }

            if(sum == 0) count++;
        }

        return count;

        
    }
}