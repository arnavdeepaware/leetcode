class Solution {
    public int isWinner(int[] player1, int[] player2) {
        
        int s1 = player1[0];
        int s2 = player2[0];

        for(int i = 1; i < player1.length; i++){
            if(i == 1){
                //Player 1
                if(player1[0] == 10){
                    s1 += player1[i];
                }
                s1 += player1[i];

                //Player 2
                if(player2[0] == 10){
                    s2 += player2[i];
                }
                s2 += player2[i];
                continue;                
            }

            //Player 1
                if(player1[i-1] == 10 || player1[i-2] == 10){
                    s1 += player1[i];
                }
                s1 += player1[i];

            //Player 2
                if(player2[i-1] == 10 || player2[i-2] == 10){
                    s2 += player2[i];
                }
                s2 += player2[i];
        }

        if(s1 > s2){
            return 1;
        }

        if(s2 > s1){
            return 2;
        }

        return 0;
    }
}