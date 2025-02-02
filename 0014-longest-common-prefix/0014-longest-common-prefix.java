class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

        if(s1.equals(s2)){
            return s1;
        }

        int i=0;
        while(i < s1.length()){
            if(s1.charAt(i) != s2.charAt(i)){
                break;
            }
            i++;
        }

        return s1.substring(0, i);
    }
}