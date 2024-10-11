class Solution {
    public boolean validMountainArray(int[] arr) {
        
        //Edge Case
        if(arr.length < 3){
            return false;
        }

        /*
                 r
            0,3,2,1
              l
        */

        boolean increasing = true;
        int prev = -1;
        int curr;

        //Traverse the array
        for(int i=0; i < arr.length; i++){
            curr = arr[i];

            if(prev == curr){
                return false;
            }

            if(increasing){
                if(prev > curr){
                    if(i == 1){
                        return false;
                    }
                    increasing = false;
                }
            } else {
                if (prev <= curr){
                    return false;
                }
            }
            prev = curr;
        }

        return !increasing;
    }
}