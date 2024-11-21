class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        
        Arrays.sort(satisfaction);
        int n = satisfaction.length;

        int sum = satisfaction[n-1];
        int val = sum;
        int max = val;

        for(int i=n-2; i >= 0; i--){

            sum += satisfaction[i];
            val += sum;
            max = Math.max(max, val);
        }

        if(max < 0){
            return 0;
        }

        return max;
    }
}