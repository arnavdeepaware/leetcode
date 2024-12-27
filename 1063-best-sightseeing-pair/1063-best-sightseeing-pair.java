class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int result = 0;
        int max = values[0];

        for(int i=1; i < values.length; i++){
            max--;
            result = Math.max(result, max + values[i]);
            max = Math.max(max, values[i]);
        }

        return result;
    }
}