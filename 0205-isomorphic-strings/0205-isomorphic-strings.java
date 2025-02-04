class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            //Case 1: Char in s is alr mapped
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else if(set.contains(t.charAt(i))){
               return false;
            }else{
                 map.put(s.charAt(i), t.charAt(i));
                 set.add(t.charAt(i));
            }
        }

        return true;
        
    }
}