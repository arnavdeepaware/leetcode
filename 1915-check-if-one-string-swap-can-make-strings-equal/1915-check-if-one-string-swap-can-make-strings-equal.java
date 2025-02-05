class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        if(s1.equals(s2)){
            return true;
        }

        int ct = 0;
        char prevS1 = ' ';
        char prevS2 = ' ';

        for(int i = 0; i < s1.length(); i++){
            if(ct > 2){
                return false;
            }

            if(s1.charAt(i) != s2.charAt(i)){
                ct ++;
                if(ct < 2){
                    prevS1 = s1.charAt(i);
                    prevS2 = s2.charAt(i);
                }else{
                    if(s1.charAt(i) != prevS2 || s2.charAt(i) != prevS1){
                        return false;
                    }
                }
            }
        }

        return ct == 2;
    }
}