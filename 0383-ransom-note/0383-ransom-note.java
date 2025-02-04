class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length()){
            return false;
        }

        HashMap<Character, Integer> freq = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            int val = freq.getOrDefault(magazine.charAt(i), 0);
            freq.put(magazine.charAt(i), ++val);
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
            char curr = ransomNote.charAt(i);

            if(freq.containsKey(curr) && freq.get(curr) > 0){
                freq.put(curr, freq.get(curr) - 1);
            }else{
                return false;
            }
        }

        return true;
    }
}