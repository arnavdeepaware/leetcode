public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        /*
            - Take the binary representation of n
            - Reverse it
            - Return the new int

            - How to represent n as binary? --> take LSB and AND operator
            - How to reverse and store the bits? --> left shift and OR operator
            - How to convert back to int? --> already an int
        */

        int result = 0;

        for(int i=0; i<32; i++){
            int bit = n & 1;
            result = (result << 1) | bit;
            n = n >>> 1;
        }

        return result;
    }
}