class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }

        HashMap map = new HashMap();

        for(Integer i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(!map.containsKey(c)){
                map.put(c, i);
            }

            if(!map.containsKey(word)){
                map.put(word, i);
            }

            if(map.get(c) != map.get(word)){
                return false;
            }
        }

        return true;
    }
}