class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        
        int n = s.length();
        int[] diffArray = new int[n];

        for(int[] shift: shifts){
            int start = shift[0];
            int end = shift[1];
            int dir = shift [2];

            if(dir == 0){
                diffArray[start] --;
                if(end + 1 < n){
                    diffArray[end + 1] ++;
                }
            }else{
                diffArray[start] ++;
                if(end + 1 < n){
                    diffArray[end + 1] --;
                }
            }
        }

        StringBuilder sb = new StringBuilder(s);
        int numShifts = 0;

        for(int i = 0; i < n; i++){
            numShifts = (numShifts + diffArray[i]) % 26;
            if(numShifts < 0) numShifts += 26;

            char c = (char) ('a' + (s.charAt(i) - 'a' + numShifts) % 26);
            sb.setCharAt(i, c);
        }

        return sb.toString();
    }
}