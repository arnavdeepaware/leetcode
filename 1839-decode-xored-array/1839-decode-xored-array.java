class Solution {
    public int[] decode(int[] encoded, int first) {

        int[] hidden = new int[encoded.length + 1];
        hidden[0] = first;

        for(int i = 0; i < encoded.length; i++){
            hidden[i+1] = hidden[i] ^ encoded[i]; 
        }

        return hidden;
        
    }
}