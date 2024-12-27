class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;

        for(int i = 0; i < flowerbed.length; i++){
            //Case 0 - Check Adjacents
            if(flowerbed[i] == 0){
                //Left is planted, skip to nect flower
                if(i > 0 && flowerbed[i-1] == 1){
                    continue;
                }
                //Right is planted, skip two flowers
                else if(i < flowerbed.length - 1 && flowerbed[i+1] == 1){
                    i += 2;
                }else{
                    count++;
                    i++;
                }

            }
            //Case 1 - Cannot be planted, skip the next one as well
            else{
                i++;
            }
        }

        return count >= n;
        
    }
}