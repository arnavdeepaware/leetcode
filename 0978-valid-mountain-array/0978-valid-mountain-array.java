class Solution {
    public boolean validMountainArray(int[] arr) {
        
        //Edge Case
        if(arr.length < 3){
            return false;
        }

        //Max Variables
        int max = -1;
        int maxIndex = 0;

        //Finding Max Element
        for(int i =0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }

        //Edge case where array is strictly decreasing or strictly increasing only
        if(maxIndex == 0 || maxIndex == arr.length - 1){
            return false;
        }

        //Pointers
        int left = 0;
        int right = maxIndex;

        while(left < maxIndex){
            if(arr[left] >= arr[left+1]){
                return false;
            }
            left++;
        }

        while(right < arr.length - 1){
            if(arr[right] <= arr[right+1]){
                return false;
            }
            right++;
        }

        return true;
    }
}