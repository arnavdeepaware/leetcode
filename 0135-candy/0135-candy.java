class Solution {
    public int candy(int[] ratings) {
        
        int n = ratings.length;

        if(n == 1){
            return 1;
        }

        int[] ans = new int[n];
        if(ratings[0] > ratings[1]){
            ans[0] = 2;
        }else{
            ans[0] = 1;
        }

        for(int i = 1; i < n; i++){
            //Check left nb
            if(ratings[i] > ratings[i-1]){
                ans[i] = ans[i-1] + 1;
            } else{
                ans[i] = 1;
            }

            System.out.print(ans[i]);
        }

        System.out.println("");

        int total = ans[n-1];

        //Right nb
        for(int i = n-2; i>= 0; i--){
            if(ratings[i] > ratings[i+1] && ans[i] <= ans[i+1]){
                ans[i] = ans[i+1] + 1;
            }

            total += ans[i];
            System.out.print(ans[i]);
        }
        

        return total;
    }
}