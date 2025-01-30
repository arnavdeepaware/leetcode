class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalGas = 0;
        int totalCost = 0;

        for(int i=0; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalCost > totalGas){
            return -1;
        }

        int start = 0;
        int currentGas = 0;
        for(int i = 0; i < gas.length; i++){
            currentGas += gas[i] - cost[i];
            if(currentGas < 0){
                start = i + 1;
                currentGas = 0;
            }
        }

        return start;
    }
}