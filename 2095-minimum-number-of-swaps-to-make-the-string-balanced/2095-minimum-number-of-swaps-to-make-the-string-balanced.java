class Solution {
    public int minSwaps(String s) {

        int open = 0;
        int close = 0;

        for(char c: s.toCharArray()){
            if(c == '['){
                open++;
            }else{
                if(open > 0){
                    open--;
                }else{
                    close++;
                }
            }
        }

        int k = 0;
        while(open > 1){
            k++;
            open -= 2;
        }

        return k + open;

        // System.out.println("open: " + open + "close: " + close);
  
    }
}