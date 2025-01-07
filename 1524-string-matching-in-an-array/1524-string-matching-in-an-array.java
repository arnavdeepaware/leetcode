class Solution {
    public List<String> stringMatching(String[] words) {

        List<String> ans = new ArrayList<>();

        for(String word: words){
            for(String temp: words){
                if(!word.equals(temp)){
                    if(word.contains(temp) && !ans.contains(temp)){
                        ans.add(temp);
                    }
                }
            }
        }

        return ans;  
    }
}