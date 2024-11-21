class Solution {
    public int numberOfBeams(String[] bank) {

        int prev = 0;
        int total = 0;

        for(int i =0; i<bank.length; i++){

            int curr = 0;
            for(int j=0; j < bank[0].length(); j++){
                if(bank[i].charAt(j) == '1'){
                    curr ++;
                }
            }

            if(curr < 1){
                continue;
            }

            total += prev * curr;
            prev = curr;
        }

        return total;
        
    }
}