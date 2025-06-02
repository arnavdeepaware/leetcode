class Solution {
    public int candy(int[] ratings) {

        if(ratings.length == 1){
            return 1;
        }

        int[] candyCount = new int[ratings.length];

        if(ratings[0] > ratings[1]){
            candyCount[0] = 2;
        }else{
            candyCount[0] = 1;
        }
        

        //Left to Right
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                candyCount[i] = candyCount[i-1] + 1;
            }else{
                candyCount[i] = 1;
            }
        }

        //Right to Left
        for(int i = ratings.length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i+1] && candyCount[i] <= candyCount[i+1]){
                candyCount[i] = candyCount[i+1] + 1;
            }
        }

        int sum = 0;
        for(int candies: candyCount){
            sum += candies;
        }

        return sum;
        
    }
}