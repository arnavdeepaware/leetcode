class Solution {
    public int minBitFlips(int start, int goal) {

        /*
            - We can use XOR logic here to compare the numbers bit by bit
            - XOR will set the bits where start and goal are different i.e. flipping bits
            - We take XOR
            - Parse the XOR value bit by bit from LSB to MSB (right to left)
            - Initialize the counter
            - Traverse until XOR becomes zero
                - Use bit masking (AND by 1) for the current bit, add the result to a counter
                - Right shift by 1 to move to the next bit
            - Return count;
        */

        int XORValue = start ^ goal;
        int count = 0;

        while(XORValue != 0){
            count += XORValue & 1;
            XORValue >>= 1;
        }

        return count;
        
    }
}